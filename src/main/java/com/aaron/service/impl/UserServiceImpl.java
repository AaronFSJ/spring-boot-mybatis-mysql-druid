package com.aaron.service.impl;

import com.aaron.entity.User;
import com.aaron.mapper.UserMapper;
import com.aaron.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Aaron on 2017/7/22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Long id) {
        return userMapper.selectById(id);
    }
}
