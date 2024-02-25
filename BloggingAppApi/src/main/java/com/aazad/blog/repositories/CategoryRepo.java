package com.aazad.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aazad.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
