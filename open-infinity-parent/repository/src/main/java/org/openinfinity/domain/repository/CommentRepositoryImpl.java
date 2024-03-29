package org.openinfinity.domain.repository;

import java.util.Collection;

import org.openinfinity.domain.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class CommentRepositoryImpl implements CommentRepository {

	@Autowired 
	MongoTemplate dbManager;
	
	@Override
	public String saveComment(Comment comment) {
		dbManager.save(comment);
		return comment.getId();
	}

	@Override
	public void removeComment(Comment comment) {
		dbManager.remove(comment);
		
	}

	@Override
	public Collection<Comment> listAll() {
		
		return dbManager.findAll(Comment.class);
	}

	@Override
	public Collection<Comment> findByStickerId(String stickerId) {
		
		return dbManager.find(new Query(Criteria.where("sticker_id").is(stickerId)), Comment.class);
	}

	@Override
	public Comment findById(String commentId) {
		
		return dbManager.findById(new Query(Criteria.where("id").is(commentId)), Comment.class);
	}

}
