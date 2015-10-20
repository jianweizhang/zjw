package com.test.init;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MyBeanTwo implements CommandLineRunner {
    public void run(String... args) {
        System.out.println("**************************************************");
        System.out.println("MyBean 2");
        System.out.println("**************************************************");
    }
}