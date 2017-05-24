package com.service;

import com.dao.AccountDao;
import com.entity.User;
import com.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kone on 2017-05-24.
 */
@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public String login() {
//        User user = new User();
//        user.setId("2");
//        user.setUsername("kone2");
//        user.setPassword("kone2");
//        accountMapper.insertUser(user);
        List<User> users = accountMapper.getUsers(0,2);
        System.out.print("service"+users.size()+"  "+users);
        return null;
    }
}
