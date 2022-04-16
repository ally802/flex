package com.pg.flex.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class User {
    private String id;
    private String password;
    private String name;
    private String phone;
    private String address;


    public User() {}

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

}
