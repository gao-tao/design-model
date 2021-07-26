package com.design.pattern.adapter.example;
/**
 */
public class Test {
    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login("snail","123456");
        adapter.loginForQQ("sjooguwoersdfjhasjfsa");
        adapter.loginForWechat("slfsjoljsdo8234ssdfs");
    }
}
