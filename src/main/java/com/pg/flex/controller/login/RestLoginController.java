package com.pg.flex.controller.login;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pg.flex.dto.User;
import com.pg.flex.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLoginController {

    @Autowired
    private LoginService service;

    @PostMapping("/login")
    public void login(HttpServletResponse response, HttpSession session, @RequestParam String id, @RequestParam String password) throws IOException {

        User user = new User();
        user.setId(id);
        user.setPassword(password);

        String loginInfo = service.login(user);

        if(loginInfo.equals("fail")) {
            session.setAttribute("fail", "fail");
        }

        session.setAttribute("userName", "userName");
        response.sendRedirect("/");
    }
    
}
