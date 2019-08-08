package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname com.example.jcwApplication
 * @Description TODO
 * @version:1.0
 * @Date 2019/8/8 18:10
 * @Created by lwd
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.example.controller")
public class jcwApplication {

    public static void main(String[] args) {
        SpringApplication.run(jcwApplication.class, args);
    }
}
