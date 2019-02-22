package com.wy.product.modo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author walte
 * @category 业务板块/方向分类/类中文名称
 * @Date 2019年02月22日
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = -2979684049990207618L;
    private Integer id;

    private String name;

    private Integer age;

    private String realname;

    private String sex;
}
