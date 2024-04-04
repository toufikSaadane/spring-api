package com.toufik.springapidemo;

import com.toufik.springapidemo.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringapidemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringapidemoApplication.class, args);
        AppConfig appConfig = applicationContext.getBean(AppConfig.class);
        System.out.println(appConfig.getUsers().get(0).getUsername());
    }

}
