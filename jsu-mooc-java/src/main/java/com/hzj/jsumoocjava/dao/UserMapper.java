package com.hzj.jsumoocjava.dao;

import com.hzj.jsumoocjava.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param userId
     * @param userPassword
     * @return
     */
    @Insert("insert into user(userId, userPassword) values(#{userId}, #{userPassword})")
    int add(@Param("userId") Integer userId, @Param("userPassword") String userPassword);

    @Select("select * from user where userId = #{userId} and userPassword = #{userPassword}")
    User findByUserIdAndUserPassword(@Param("userId") Integer userId, @Param("userPassword") String userPassword);

}
