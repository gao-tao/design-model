package com.design.pattern.state.order;

import java.util.Map;

public interface IOrderService {

    /**
     * 创建订单
     * @return
     */
    Order create();

    /**
     * 发起支付
     * @param id
     * @return
     */
    Order pay(int id);

    /**
     * 订单发货
     * @param id
     * @return
     */
    Order deliver(int id);

    /**
     * 订单收货
     * @param id
     * @return
     */
    Order receive(int id);

    /**
     * 获取所有订单信息
     * @return
     */
    Map<Integer, Order> getOrders();
}
