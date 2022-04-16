package com.pg.flex.dao;

import java.util.List;

import com.pg.flex.dto.User;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface TestDao {

  public List<User> getAllUser();

  public User login(User user);

  public void signUp(User user);

  public int checkId(User user);
  
}
