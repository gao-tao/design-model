package com.design.pattern.state.order;

import lombok.Data;

@Data
public class Order {

    private int id;

    private OrderStatus status;

    @Override
    public String toString() {
        return "订单号" + id + ", 订单状态：" + status;
    }
}
