package com.jun.sentinel.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    private int OrderId;
    private BigDecimal total;
}
