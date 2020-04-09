package com.smart.dao.hibernate;

import com.smart.domain.Topic;
import org.springframework.stereotype.Repository;

@Repository
public class TopicHibernateDao extends BaseDao {
	public void addTopic(Topic topic) {
		getHibernateTemplate().save(topic);
	}
	
	public Topic getTopicById(int topicId){
		return getHibernateTemplate().get(Topic.class, topicId);
	}
}
