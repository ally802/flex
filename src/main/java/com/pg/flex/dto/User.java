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
}
