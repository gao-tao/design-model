package com.design.model.facade;

import org.apache.ibatis.session.Configuration;
import org.springframework.jdbc.support.JdbcUtils;

public class Test {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
