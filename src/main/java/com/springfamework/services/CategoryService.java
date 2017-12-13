package com.springfamework.services;

import com.springfamework.api.v1.model.CategoryDTO;

import java.util.List;

/**
 * Created by Harish on 9/26/17.
 */
public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
