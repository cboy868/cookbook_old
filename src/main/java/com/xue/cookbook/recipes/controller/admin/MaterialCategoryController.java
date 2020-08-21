package com.xue.cookbook.recipes.controller.admin;

import java.util.List;

import com.xue.cookbook.core.utils.JsonData;
import com.xue.cookbook.core.utils.TreeHelper;
import com.xue.cookbook.core.utils.TreeInterface;
import com.xue.cookbook.recipes.model.MaterialCategory;
import com.xue.cookbook.recipes.service.MaterialCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("save")
    public JsonData save() throws JsonProcessingException {

        MaterialCategory category = new MaterialCategory();
        category.setName("测试类目");
        category.setPid(new Long(0));
        int a = materialCategoryService.insert(category);


        return JsonData.success(a);
    }
}