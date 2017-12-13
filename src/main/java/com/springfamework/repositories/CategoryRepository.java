package com.springfamework.repositories;

import com.springfamework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Harish on 9/24/17.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

}
