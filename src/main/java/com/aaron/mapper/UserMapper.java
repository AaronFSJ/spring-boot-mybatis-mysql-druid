package com.aaron.mapper;

import com.aaron.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Aaron on 2017/7/22.
 */
@Mapper
public interface UserMapper {

    public User selectById(Long id);
}
