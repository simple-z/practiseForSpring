package com.smart.dao.mybatis;

import com.smart.domain.Forum;

import java.util.List;

public interface ForumMybatisDao{
	void addForum(Forum forum);	
	void updateForum(Forum forum) ;
	Forum getForum(int forumId) ;
	long getForumNum() ;
	List<Forum> findForumByName(String forumName);
}
