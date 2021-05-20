package com.design.pattern.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 使用单例+工厂+策略模式
 */
public class PromotionStrategyFactory {

    private static Map<String, IPromotionStrategy> PROMOTIONS = new HashMap<>();

    static {
        PROMOTIONS.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK, new CashBackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBUY, new GroupBuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    private PromotionStrategyFactory() {
    }

    public static IPromotionStrategy getPromotionStrategy(String promotionKey) {

        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);

        return strategy == null ? EMPTY : strategy;
    }

    public static Set<String> getPromotionKeys() {
        return PROMOTIONS.keySet();
    }
}
