package com.aaron.service;

import com.aaron.entity.User;

/**
 * Created by Aaron on 2017/7/22.
 */
public interface UserService {

    public User selectById(Long id);
}
