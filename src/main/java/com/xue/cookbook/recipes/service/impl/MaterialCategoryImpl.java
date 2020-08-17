package com.xue.cookbook.recipes.service.impl;

import java.util.List;
import com.xue.cookbook.recipes.dao.MaterialCategoryMapper;
import com.xue.cookbook.recipes.model.MaterialCategory;
import com.xue.cookbook.recipes.service.MaterialCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MaterialCategoryImpl implements MaterialCategoryService {

    @Autowired
    MaterialCategoryMapper materialCategoryMapper;

    // @Override
    // public List<MaterialCategory> selectAllActive() {
    //     return materialCategoryMapper.selectAllActive();
    // }
    
}