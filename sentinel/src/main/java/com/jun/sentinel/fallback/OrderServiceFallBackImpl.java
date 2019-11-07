package com.jun.sentinel.fallback;

import com.jun.sentinel.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceFallBackImpl implements OrderService {
    @Override
    public String getOrders(int uid) {

        return "网络不给了";
    }
}
