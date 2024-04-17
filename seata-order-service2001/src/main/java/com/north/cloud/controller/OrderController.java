package com.north.cloud.controller;

import com.north.cloud.entities.Order;
import com.north.cloud.resp.ResultData;
import com.north.cloud.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author eternal
 * @version 1.0
 * @description: TODO
 * @date 2024/4/17 下午9:04
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public ResultData create(Order order)
    {
        orderService.create(order);
        return ResultData.success(order);
    }
}
