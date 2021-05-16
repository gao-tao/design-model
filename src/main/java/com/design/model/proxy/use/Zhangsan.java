package com.design.model.proxy.use;

public class Zhangsan implements IPerson{

    @Override
    public void findWork() {
        System.out.println("老子喜欢的工作");
    }
}
