package com.fgeorgiou.parcellocker.service.impl;

import com.fgeorgiou.parcellocker.repository.UserDao;
import com.fgeorgiou.parcellocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

}
