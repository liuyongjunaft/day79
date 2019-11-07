package com.jun.dubboapi;

import com.jun.dubboapi.dto.OrderDto;

import java.util.List;

public interface OrderService {
    public List<OrderDto> getOrders();
}
