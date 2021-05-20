package com.design.pattern.factory.abstractFactory;

public class ChineseNote implements INote{
    @Override
    public void edit() {
        System.out.println("写笔记");
    }
}
