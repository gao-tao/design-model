package com.design.model.template.jdbc;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        MemberDao dao = new MemberDao(null);
        List<?> result = dao.selectAll();
        System.out.println(result);
    }
}
