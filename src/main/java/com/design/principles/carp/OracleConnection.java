package com.design.principles.carp;

public class OracleConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}
