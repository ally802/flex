package com.pg.flex.controller.login;

import javax.servlet.http.HttpSession;

import com.pg.flex.dto.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String main(HttpSession session, @RequestParam(value = "fail", defaultValue = "") String fail) {
        return "/index";
    }

    @GetMapping("/home")
    public String homeIndex() {
        return "/home/main";
    }

    @GetMapping(value = "/sign-in")
    public String signIn(HttpSession session) {
        return "/sign/sign-in";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session) {

        session.removeAttribute("userName");
        return "redirect:/";
    }
}
