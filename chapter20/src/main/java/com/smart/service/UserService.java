package com.smart.service;
import com.smart.domain.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
    boolean hasMatchUser(String userName, String password);
    User findUserByUserName(String userName);
    void loginSuccess(User user);
    void registerUser(User user);
}
