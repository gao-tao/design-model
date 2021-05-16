package com.design.model.abstractFactory;

public class ChineseNote implements INote{
    @Override
    public void edit() {
        System.out.println("写笔记");
    }
}
