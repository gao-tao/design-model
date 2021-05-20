package com.design.pattern.strategy;

/**
 * 枚举实现策略模式
 */
public enum PromotionStrategyFactoryEnum {

    COUPON(PromotionKey.COUPON, new CouponStrategy()),
    CASHBACK(PromotionKey.CASHBACK, new CashBackStrategy()),
    GROUPBUY(PromotionKey.GROUPBUY, new GroupBuyStrategy());

    private String type;

    private IPromotionStrategy promotionStrategy;

    PromotionStrategyFactoryEnum(String type, IPromotionStrategy promotionStrategy) {
        this.type = type;
        this.promotionStrategy = promotionStrategy;
    }

    public static IPromotionStrategy typeClass(String type) {

        for (PromotionStrategyFactoryEnum value : values()) {
            if (value.type.equals(type)) {
                return value.promotionStrategy;
            }
        }
        return new EmptyStrategy();
    }


}
