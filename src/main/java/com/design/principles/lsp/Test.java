package com.design.principles.lsp;

import java.util.HashMap;

/**
 * 里氏替换原则(Liskov Substitution Principle,LSP)：如果对每一类型为T1的对象o1，都有类型为T2的对象o2，使得T1定义的所有程序P在所有的对象o1都替换成o2，程序P的
 * 行为没有发生变化，那么类型T2是T1的子类型。
 * 引申含义：子类可以扩展父类的而功能，但不能改变父类原有的功能
 * 1、子类可以实现父类的抽象方法，但不能覆盖父类的而非抽象方法
 * 2、子类中可以增加自己特有的方法
 * 3、当子类的方法重载父类的方法时i，方法的前置条件（即方法的输入、入参）要比父类方法的输入参数更宽
 * 4、当子类的方法实现父类的方法时（重写、重载或实现抽象方法），方法的后置条件（即方法的输出、返回值）要比父类更严格或相等。
 */
public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.jump(new HashMap());
        dog.eat();
    }
}
