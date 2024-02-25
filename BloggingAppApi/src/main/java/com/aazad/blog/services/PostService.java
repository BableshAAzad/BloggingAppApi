package com.aazad.blog.services;

import java.util.List;

import com.aazad.blog.entities.Post;
import com.aazad.blog.payloads.PostDto;
import com.aazad.blog.payloads.PostResponse;

public interface PostService {

//	Create 
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
//	Update
	PostDto updatePost(PostDto postDto, Integer postId);
	
//	Delete
	void deletePost(Integer postId);
	
//	Get all post
//	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);
	PostResponse getAllPost(Integer pageNumber, Integer pageSize);
	
//	Get single post
	PostDto getPostById(Integer postId);
	
//	Get All post by Category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
//	Get all post by user
	List<PostDto> getPostsByUser(Integer userId);
	
//	Search posts
	List<Post> searchPosts(String keyword);
}
