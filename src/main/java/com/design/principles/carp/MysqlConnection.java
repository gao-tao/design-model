package com.design.principles.carp;

public class MysqlConnection extends DBConnection{

    @Override
    public String getConnection() {
        return "Mysql数据库连接";
    }
}
