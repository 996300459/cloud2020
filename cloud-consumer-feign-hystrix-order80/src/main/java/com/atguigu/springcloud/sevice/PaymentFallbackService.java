package com.atguigu.springcloud.sevice;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author liangtainci
 * @Date 2023/1/19
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}