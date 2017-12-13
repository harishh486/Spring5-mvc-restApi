package com.springfamework.api.v1.mapper;

import com.springfamework.api.v1.model.CategoryDTO;
import com.springfamework.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by Harish on 9/25/17.
 */
@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDTO categoryToCategoryDTO(Category category);
}
