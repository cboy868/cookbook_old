package com.xue.cookbook.core.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xue.cookbook.recipes.model.MaterialCategory;

public class TreeHelper {

    /**
     * 形成树
     * @param $records
     * @return array
     */
    public static List<MaterialCategory> makeTree(List<MaterialCategory> records) {
        List<MaterialCategory> rootNodes= new ArrayList<>();
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
                //6.查看此Node的ParentNode的 ChildNodes是否存在 没有则创建
                if (childNodesMap.get(node.getPid()) == null) {
                    childNodesMap.put(node.getPid(), new HashSet<MaterialCategory>());
                }

                childNodesMap.get(node.getPid()).add(node);
            }
        }
        return rootNodes;
    }
}