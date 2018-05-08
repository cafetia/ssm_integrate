package com.ssm.services;


import com.ssm.entities.User;

public interface UserService {
     User queryUser(long userId) ;
     void addUser(User user);
     void modifyUser(User user);
}

