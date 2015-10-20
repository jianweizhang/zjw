package com.test.init;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class MyBean implements CommandLineRunner {
    public void run(String... args) {
        System.out.println("**************************************************");
        System.out.println("MyBean 3");
        System.out.println("**************************************************");
    }
}