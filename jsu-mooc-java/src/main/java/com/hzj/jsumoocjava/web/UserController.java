package com.hzj.jsumoocjava.web;

import com.hzj.jsumoocjava.entity.User;
import com.hzj.jsumoocjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 创建用户  (增)
     * @param userId
     * @param userPassword
     * @return
     */
    @PostMapping("/add")
    public int addUser(@RequestParam("userId") Integer userId, @RequestParam("userPassword") String userPassword)  {
       return userService.add(userId, userPassword);
    }

    @PostMapping("/login")
    public User login(@RequestParam("userId") Integer userId, @RequestParam("userPassword") String userPassword) {
        System.out.println(userId);
        System.out.println(userPassword);

        if (userService.findByUserIdAndUserPassword(userId, userPassword) != null) {
            User user = userService.findByUserIdAndUserPassword(userId, userPassword);
            return user;
        }
        return null;
    }
}
