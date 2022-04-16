package com.pg.flex.service;

import com.pg.flex.dao.TestDao;
import com.pg.flex.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    TestDao dao;

    public String login(User user) {
        User userInfo = dao.login(user);
        
        if(!userInfo.getName().isEmpty()) return userInfo.getName();

        return "fail";

    }

    public void signUp(User user) {
        dao.signUp(user);
    }

    public int checkId(User user) {
        return dao.checkId(user);
    }
    
}
