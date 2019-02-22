package com.wy.product.controller;

import com.wy.product.modo.User;
import com.wy.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author walte
 * @category 业务板块/方向分类/类中文名称
 * @Date 2019年02月22日
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public List<User> find(){
        return userService.find();
    }
}
