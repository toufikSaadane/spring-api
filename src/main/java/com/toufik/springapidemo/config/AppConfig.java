package com.toufik.springapidemo.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "application")
public class AppConfig {
    private Props props;
    private List<UsersConfig> users;
}
