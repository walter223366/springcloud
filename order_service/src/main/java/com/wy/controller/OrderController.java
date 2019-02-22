package com.wy.controller;

import com.wy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author walte
 * @category 业务板块/方向分类/类中文名称
 * @Date 2019年02月22日
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/getUser")
    public Object getUser(){
        return orderService.getUser();
    }
}
