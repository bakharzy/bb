package org.openinfinity.domain.service;

import java.util.Collection;

import org.openinfinity.domain.entity.Comment;
import org.openinfinity.domain.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository repo;
	@Override
	public String saveComment(Comment comment) {
		repo.saveComment(comment);
		return comment.getId();
	}

	@Override
	public void removeComment(Comment comment) {
		repo.removeComment(comment);		
	}

	@Override
	public Collection<Comment> listAll() {
		return repo.listAll();
	}

	@Override
	public Collection<Comment> findByStickerId(String stickerId) {
		return repo.findByStickerId(stickerId);
	}

	@Override
	public Comment findById(String commentId) {
	
		return repo.findById(commentId);
	}


}
