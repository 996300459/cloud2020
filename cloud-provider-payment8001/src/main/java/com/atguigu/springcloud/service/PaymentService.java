package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 类名称:PaymentService
 * 类描述:TODO
 * 创建人:LENOVO
 * 创建时间:2023/1/4 21:23
 * Version 1.0
 */

public interface PaymentService {
     public int create(Payment payment);
     public  Payment selectById(@Param("id") Long id);
}
