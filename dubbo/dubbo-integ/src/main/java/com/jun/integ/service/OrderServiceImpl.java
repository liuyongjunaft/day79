package com.jun.integ.service;

import com.jun.dubboapi.OrderService;
import com.jun.dubboapi.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDto> getOrders() {
        List<OrderDto> list = new ArrayList<>();
        OrderDto orderDto = new OrderDto();
        orderDto.setId(1);
        orderDto.setNo("7454416sadasd");
        list.add(orderDto);
        return list;
    }
}
