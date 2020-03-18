package com.xhw.springbootmybatis.mapper;

import com.xhw.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {
    @Select("select * from db_user")
    List<User> getUserlist();
}
