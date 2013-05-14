package org.openinfinity.domain.service;

import java.util.Collection;

import org.openinfinity.domain.entity.Comment;

public interface CommentService {

		String saveComment(Comment comment);
		
		void removeComment(Comment comment);
		
		Collection<Comment> listAll();
		
		Collection<Comment> findByStickerId(String stickerId);
		
		Comment findById(String commentId);
}
