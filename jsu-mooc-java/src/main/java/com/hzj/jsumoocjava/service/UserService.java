package com.hzj.jsumoocjava.service;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.hzj.jsumoocjava.dao.UserMapper;
import com.hzj.jsumoocjava.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户, 即用户注册
     * @param userId
     * @param userPassWord
     * @return
     */
    public int add(Integer userId, String userPassWord) {

        return userMapper.add(userId, userPassWord);
//        return userMapper.add(userId, userPassWord);
    }


    public User findByUserIdAndUserPassword(Integer userId, String userPassword) {
        return userMapper.findByUserIdAndUserPassword(userId, userPassword);
    }

}
