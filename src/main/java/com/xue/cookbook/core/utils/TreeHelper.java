package com.xue.cookbook.core.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.xue.cookbook.core.contracts.TreeInterface;


public class TreeHelper {

    /**
     * 形成树
     * @param $records
     * @return array
     */
    public static List<TreeInterface> makeTree(List<TreeInterface> records) {
        List<TreeInterface> rootNodes= new ArrayList<>();
        Map<Long, Set<TreeInterface>> childNodesMap= new HashMap<Long, Set<TreeInterface>>();

        for (TreeInterface node: records) { 
            if (childNodesMap.get(node.getId()) == null) {
                childNodesMap.put(node.getId(), new HashSet<TreeInterface>());
            }
            node.setChildren(childNodesMap.get(node.getId()));
            if (node.getPid() == 0) {
                rootNodes.add(node);
            }

            if (node.getPid() != 0) {
                if (childNodesMap.get(node.getPid()) == null) {
                    childNodesMap.put(node.getPid(), new HashSet<TreeInterface>());
                }

                childNodesMap.get(node.getPid()).add(node);
            }
        }
        return rootNodes;
    }
}