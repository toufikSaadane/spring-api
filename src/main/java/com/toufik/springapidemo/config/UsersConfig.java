package com.toufik.springapidemo.config;

import lombok.Data;

import java.util.List;

@Data
public class UsersConfig {
    private String username;
    private String password;
    private List<String> roles;
}
