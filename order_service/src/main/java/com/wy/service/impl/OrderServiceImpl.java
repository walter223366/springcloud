package com.wy.service.impl;

import com.wy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author walte
 * @category 业务板块/方向分类/类中文名称
 * @Date 2019年02月22日
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Object getUser() {
        return restTemplate.getForObject("http://product-service/product/findUser",Object.class);
    }
}
