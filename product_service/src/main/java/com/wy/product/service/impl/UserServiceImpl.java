package com.wy.product.service.impl;

import com.wy.product.mapper.UserMapper;
import com.wy.product.modo.User;
import com.wy.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author walte
 * @category 业务板块/方向分类/类中文名称
 * @Date 2019年02月22日
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> find() {
        return userMapper.find();
    }
}
