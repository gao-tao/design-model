package com.design.pattern.strategy;

public class Test {
    public static void main(String[] args) {

        String promotionKey = "COUPON";

//        PromotionStrategyFactory.getPromotionKeys();
//        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
//        promotionStrategy.doPromotion();


        IPromotionStrategy strategy = PromotionStrategyFactoryEnum.typeClass(promotionKey);
        strategy.doPromotion();

    }
}
