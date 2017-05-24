package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by kone on 2017-05-24.
 */
public interface AccountMapper {
    public void insertUser(User user);
    public List<User> getUsers(@Param("offset")int offset, @Param("limit")int limit );
}
