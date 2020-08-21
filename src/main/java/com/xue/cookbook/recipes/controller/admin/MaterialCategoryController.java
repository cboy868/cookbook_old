package com.xue.cookbook.recipes.controller.admin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.xue.cookbook.core.utils.JsonData;
import com.xue.cookbook.core.utils.TestAbc;
import com.xue.cookbook.core.utils.TreeDataInterface;
import com.xue.cookbook.core.utils.TreeHelper;
import com.xue.cookbook.recipes.model.MaterialCategory;
import com.xue.cookbook.recipes.service.MaterialCategoryService;
import com.xue.cookbook.recipes.service.impl.MaterialCategoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/api/v1/pri/material_category")
public class MaterialCategoryController {

    @Autowired
    MaterialCategoryService materialCategoryService;

    @RequestMapping("list")
    public JsonData list() throws JsonProcessingException {
        List<MaterialCategory> list = materialCategoryService.selectAllActive();
        // List<MaterialCategory> tree = TreeHelper.makeTree(list);

        List<MaterialCategory> tree = MaterialCategoryImpl.makeTree(list);



        // Set<TestAbc> set = new HashSet<TestAbc>();

        // TestAbc t = new TestAbc();
        // t.setId(new Integer(1));
        // set.add(t);
        
        


        




        return JsonData.success(tree);
    }
}