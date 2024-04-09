package com.example.mapper;

import com.example.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from admin where adminname = #{adminname}")
    Account findUserByName(String adminname);
}
