package com.design.principles.lsp;

import java.util.HashMap;
import java.util.Map;

public class Dog extends Animal{

    public HashMap eat() {
        System.out.println("小狗吃饭");
        return null;
    }

    public Map jump(HashMap type) {
        System.out.println("xxx");
        return null;
    }
}
