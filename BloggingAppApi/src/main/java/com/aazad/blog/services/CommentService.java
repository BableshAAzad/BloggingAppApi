package com.aazad.blog.services;

import com.aazad.blog.payloads.CommentDto;

public interface CommentService {

	CommentDto createCommnet(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);
}
