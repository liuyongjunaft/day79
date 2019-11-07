package com.jun.sentinel.service;

import com.jun.sentinel.fallback.OrderServiceFallBackImpl;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "server-integ-config",fallback = OrderServiceFallBackImpl.class )
public interface OrderService {
    @RequestMapping("/order/list/{uid}")
    String getOrders(@PathVariable int uid);
}
