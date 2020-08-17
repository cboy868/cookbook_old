package com.xue.cookbook.recipes.controller.admin;

import java.util.List;

import com.xue.cookbook.core.utils.JsonData;
import com.xue.cookbook.recipes.model.MaterialCategory;
import com.xue.cookbook.recipes.service.MaterialCategoryService;
import com.xue.cookbook.recipes.service.impl.MaterialCategoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pri/material_category")
public class MaterialCategoryController {
    
    @Autowired
    MaterialCategoryService materialCategoryService;


    @RequestMapping("list")
    public JsonData list() {
        List<MaterialCategory> list = materialCategoryService.selectAllActive();
        MaterialCategoryImpl.makeTree(list);
        return JsonData.success(list);
    }
}