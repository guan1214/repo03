package com.service.serviceImpl;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class User_ServiceImpl implements UserServiceInter {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(int i) {

       User user= userDao.findUserById(i);

        return user;
    }
}
