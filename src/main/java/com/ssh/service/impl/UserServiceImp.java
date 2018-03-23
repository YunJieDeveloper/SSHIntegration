package com.ssh.service.impl;

import com.ssh.dao.IUserDao;
import com.ssh.dto.User;
import com.ssh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImp")
public class UserServiceImp implements IUserService {

    @Autowired
    IUserDao userDao;

    public User find(User user) {
        return userDao.get("from User where userName=? and password=?",user.getUserName(),user.getPassword());
    }
}
