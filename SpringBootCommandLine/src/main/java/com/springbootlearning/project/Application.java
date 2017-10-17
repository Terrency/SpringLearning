package com.springbootlearning.project;

import com.springbootlearning.project.model.UserModel;
import com.springbootlearning.project.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Junyu on 2017/10/17.
 */
@SpringBootApplication
@MapperScan("com.springbootlearning.project.dao")
public class Application implements CommandLineRunner{
    @Autowired
    private UserService userService;

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        UserModel um = userService.queryObject(1);
        System.out.println(um.toString());
    }
}
