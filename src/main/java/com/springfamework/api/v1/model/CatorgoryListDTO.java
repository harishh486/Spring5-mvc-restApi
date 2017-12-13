package com.springfamework.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by Harish on 9/26/17.
 */
@Data
@AllArgsConstructor
public class CatorgoryListDTO {

    List<CategoryDTO> categories;

}
