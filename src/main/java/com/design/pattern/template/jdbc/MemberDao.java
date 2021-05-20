package com.design.pattern.template.jdbc;

import javax.sql.DataSource;
import java.util.List;

public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, (RowMapper<Member>) (rs, rowNum) -> {
            Member member = new Member();

            //字段多的话 使用反射  原型模式
            member.setUserName(rs.getString("username"));
            member.setPassword(rs.getString("password"));
            member.setAddr(rs.getString("addr"));
            member.setAge(rs.getInt("age"));
            return member;
        },null);
    }
}
