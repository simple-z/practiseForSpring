package com.smart.dao.hibraw;

import com.smart.domain.Post;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PostHibernateDao {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addPost(Post post) {
		sessionFactory.getCurrentSession().save(post);
	}
	public Post getPost(int postId) {
		// TODO Auto-generated method stub
		return null;
	}

}
