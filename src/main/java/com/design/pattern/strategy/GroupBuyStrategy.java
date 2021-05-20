package com.design.pattern.strategy;

public class GroupBuyStrategy implements IPromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("团购打折优惠");
    }
}
