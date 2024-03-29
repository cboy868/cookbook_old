package com.xue.cookbook.recipes.service.impl;

import java.util.List;

import com.xue.cookbook.core.abstracts.CategoryService;
import com.xue.cookbook.core.contracts.TreeInterface;
import com.xue.cookbook.recipes.dao.MaterialCategoryMapper;
import com.xue.cookbook.recipes.model.MaterialCategory;
import com.xue.cookbook.recipes.service.MaterialCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialCategoryImpl extends CategoryService implements MaterialCategoryService {

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

    @Override
    public int update(MaterialCategory record) {
        return materialCategoryMapper.updateByPrimaryKey(record);
    }

    @Override
    public TreeInterface findById(Long id) {
        return materialCategoryMapper.selectByPrimaryKey(id);
    }
    
}