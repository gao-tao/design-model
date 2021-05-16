package com.design.model.template.uml;

import org.apache.ibatis.executor.BaseExecutor;

import javax.servlet.http.HttpServlet;
import java.util.AbstractList;

public abstract class AbstractClass {

    public final void step() {
        step1();
        step2();
        step3();

        if (needCheckHomeWork()) {
            checkHomeWork();
        }
    }

    public void step1() {
        System.out.println("step1");
    }

    public void step2() {
        System.out.println("step2");
    }

    public void step3() {
        System.out.println("step3");
    }

    public abstract void checkHomeWork();

    public Boolean needCheckHomeWork() {
        return false;
    }
}
