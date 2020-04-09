package com.smart.dao;

import com.smart.domain.LoginLog;
import org.springframework.stereotype.Repository;
@Repository
public interface LoginLogDao {
   void insertLoginLog(LoginLog loginLog);
}