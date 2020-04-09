package com.smart.dao;

import com.smart.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
   int getMatchCount(String userName, String password);
   User findUserByUserName(String userName);
   void updateLoginInfo(User user);
   void save(User user);
   void clean();
}
