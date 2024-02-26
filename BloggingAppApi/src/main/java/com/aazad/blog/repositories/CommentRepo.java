package com.aazad.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aazad.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

	
}
