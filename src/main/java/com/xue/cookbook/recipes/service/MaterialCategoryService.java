package com.xue.cookbook.recipes.service;

import java.util.List;

import com.xue.cookbook.core.contracts.TreeInterface;
import com.xue.cookbook.recipes.model.MaterialCategory;

public interface MaterialCategoryService {
    List<TreeInterface> selectAllActive();

    int insert(MaterialCategory record); 

    int update(MaterialCategory record);

    TreeInterface getParent(TreeInterface record);

    TreeInterface findById(Long id);
}