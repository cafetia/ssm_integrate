package com.ssm.services.impl;

import com.ssm.entities.User;
import com.ssm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
   @Autowired
    private UserDao userDao;
    public User queryUser(long userId) {
        return userDao.getUsers(userId);
    }
    public void addUser(User user){
        userDao.addUser(user);
    }

    public void modifyUser(User user){
        userDao.updateUser(user);
    }
}
