package com.jun.user.domain.entity;

import lombok.Data;

@Data
public class User {
    private Integer uId;

    private String username;

    private String password;

    private Integer fans;

    private Integer isDelete;

    private Integer level;
}