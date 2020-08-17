package com.xue.cookbook.recipes.service.impl;

import java.util.ArrayList;
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
        List<MaterialCategory> tree = new ArrayList<MaterialCategory>();

        for(MaterialCategory record:records) {

            System.out.println(record);
        }


        // $tree = [];
        // $records = array_index($records, 'id');
        // foreach ($records as &$record) {
        //     if ($record['pid'] != 0 && isset($records[$record['pid']])) {
        //         $records[$record['pid']]['children'][] = &$records[$record['id']];
        //     } else {
        //         $tree[] = &$records[$record['id']];
        //     }
        // }
        // unset($record);

        // return $tree;
        return tree;
    }
    
}