package com.design.pattern.delegate.example;

public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("海报",new Leader());
        boss.command("爬虫",new Leader());
        boss.command("手机",new Leader());
    }
}
