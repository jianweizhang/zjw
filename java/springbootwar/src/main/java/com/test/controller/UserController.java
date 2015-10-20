package com.test.controller;



import com.test.modle.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${name}")
    private String name;

    @Autowired
    private UserRepository userRepository;
  
    @RequestMapping("/{id}")  
    public User view(@PathVariable("id") Long id) {
        User user = userRepository.findByNameAndId("zjw1", id);
        return user;
    }

    @RequestMapping("/list")
    public Iterable<User> list() {
        Iterable<User> all = userRepository.findAll();
        return all;
    }

    @RequestMapping("/save")
    public Map<String, String> save() {
        for (int i = 0; i < 10; i++){
            User user = new User();
            user.setName(name + i);
            userRepository.save(user);
        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("msg", "ok");
        return map;
    }

}