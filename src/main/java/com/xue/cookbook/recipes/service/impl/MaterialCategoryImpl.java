package com.xue.cookbook.recipes.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xue.cookbook.recipes.dao.MaterialCategoryMapper;
import com.xue.cookbook.recipes.model.MaterialCategory;
import com.xue.cookbook.recipes.service.MaterialCategoryService;

import org.apache.ibatis.annotations.Lang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MaterialCategoryImpl implements MaterialCategoryService {

    @Autowired
    MaterialCategoryMapper materialCategoryMapper;

    @Override
    public List<MaterialCategory> selectAllActive() {
        return materialCategoryMapper.selectAllActive();
    }

    /**
     * 形成树
     * @param $records
     * @return array
     */
    public static List<MaterialCategory> makeTree(List<MaterialCategory> records) {
        List<MaterialCategory> rootNodes= new ArrayList<MaterialCategory>();
        Map<Long, Set<MaterialCategory>> childNodesMap= new HashMap<Long, Set<MaterialCategory>>();

        for (MaterialCategory node: records) { 
            if (childNodesMap.get(node.getId()) == null) {
                childNodesMap.put(node.getId(), new HashSet<MaterialCategory >());
            }
            node.setChildren(childNodesMap.get(node.getId()));
            if (node.getPid() == 0) {
                rootNodes.add(node);
            }

            if (node.getPid() != 0) {
                if (childNodesMap.get(node.getPid()) == null) {
                    childNodesMap.put(node.getPid(), new HashSet<MaterialCategory >());
                }

                childNodesMap.get(node.getPid()).add(node);
            }

        }

        return rootNodes;

    }
    
}