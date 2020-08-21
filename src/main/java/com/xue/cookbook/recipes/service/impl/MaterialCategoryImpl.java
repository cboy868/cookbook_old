package com.xue.cookbook.recipes.service.impl;

import java.util.List;

import com.xue.cookbook.core.utils.TreeInterface;
import com.xue.cookbook.recipes.dao.MaterialCategoryMapper;
import com.xue.cookbook.recipes.model.MaterialCategory;
import com.xue.cookbook.recipes.service.MaterialCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialCategoryImpl implements MaterialCategoryService {

    @Autowired
    MaterialCategoryMapper materialCategoryMapper;

    @Override
    public List<TreeInterface> selectAllActive() {
        return materialCategoryMapper.selectAllActive();
    }

    @Override
    public int insert(MaterialCategory record) {
        return materialCategoryMapper.insert(record);
    }
    
}