package com.xue.cookbook.recipes.dto;

import lombok.Data;

@Data
public class MaterialCategoryDto {

    private Long pid;
    
    private String name;

    private String intro;

    private String sort;

    private String cover;
}