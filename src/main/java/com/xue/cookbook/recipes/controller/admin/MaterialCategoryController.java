package com.xue.cookbook.recipes.controller.admin;

import java.util.List;

import com.xue.cookbook.core.utils.JsonData;
import com.xue.cookbook.core.utils.TreeHelper;
import com.xue.cookbook.core.contracts.TreeInterface;
import com.xue.cookbook.recipes.model.MaterialCategory;
import com.xue.cookbook.recipes.model.request.MaterialCategoryRequest;
import com.xue.cookbook.recipes.service.MaterialCategoryService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
@RequestMapping("/api/v1/pri/material_category")
public class MaterialCategoryController {

    @Autowired
    MaterialCategoryService materialCategoryService;

    @RequestMapping("list")
    public JsonData list() throws JsonProcessingException {
        List<TreeInterface> list = materialCategoryService.selectAllActive();
        List<TreeInterface> tree = TreeHelper.makeTree(list);

        return JsonData.success(tree);
    }

    @RequestMapping("create")
    public JsonData create(@RequestBody MaterialCategoryRequest materialCategoryRequest) 
        throws JsonProcessingException {

        MaterialCategory category = new MaterialCategory();
        BeanUtils.copyProperties(materialCategoryRequest, category);

        int a = materialCategoryService.insert(category);

        return JsonData.success(a);
    }

    @RequestMapping("update")
    public JsonData update(@RequestBody MaterialCategoryRequest materialCategoryRequest) {
        MaterialCategory category = new MaterialCategory();

        BeanUtils.copyProperties(materialCategoryRequest, category);
        if (materialCategoryService.update(category) == 1) {
            return JsonData.success();
        }
        return JsonData.error("更新失败");
    }

    @RequestMapping("detail")
    public JsonData detail(@RequestParam Long id) {
        return JsonData.success(materialCategoryService.findById(id));
    }
}