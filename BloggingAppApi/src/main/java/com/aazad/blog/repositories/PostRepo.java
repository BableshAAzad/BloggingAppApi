package com.aazad.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aazad.blog.entities.Category;
import com.aazad.blog.entities.Post;
import com.aazad.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);
}
