package com.pg.flex.controller;

import java.util.List;

import com.pg.flex.dao.TestDao;
import com.pg.flex.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private TestDao dao;

  @Autowired 
  public TestController(TestDao dao) {
    this.dao = dao;
  }
  @GetMapping(value = "/users")
  public List<User> getAllUser() {
    return dao.getAllUser();
  }

  @GetMapping(value = "/test")
    public String asd() {
        return "test";
    }
}
