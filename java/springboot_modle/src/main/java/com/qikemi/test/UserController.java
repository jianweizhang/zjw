package com.qikemi.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {


    @RequestMapping("/create")
    @ResponseBody
    public String create() {
        User user = null;
        try {
            user = new User("389727649@qq.com", "zjw");
            userDao.save(user);
        } catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created! (id = " + user.getId() + ")";
    }

    @RequestMapping("/get")
    @ResponseBody
    public User get() {
        User user = userDao.findByEmail("3897276491@qq.com");
        return user;
    }

    @RequestMapping("/wel")
    public String welcome() {
        return "welcome";
    }


    @Autowired
    private UserDao userDao;

}