package com.xue.cookbook.core.abstracts;

import com.xue.cookbook.core.contracts.TreeInterface;
import com.xue.cookbook.recipes.dao.MaterialCategoryMapper;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {

    @Autowired
    MaterialCategoryMapper materialCategoryMapper;
    
    public TreeInterface getParent(TreeInterface record) {
        if (record.getPid() == 0) {
            return null;
        }

        return materialCategoryMapper.selectByPrimaryKey(record.getPid());
    }
}