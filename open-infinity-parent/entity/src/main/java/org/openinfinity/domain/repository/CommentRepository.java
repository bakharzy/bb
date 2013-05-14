package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.Comment;

public interface CommentRepository {

		String saveComment(Comment comment);
		
		void removeComment(Comment comment);
		
		Collection<Comment> listAll();
		
		Collection<Comment> findByStickerId(String stickerId);
		
		Comment findById(String commentId);
}
