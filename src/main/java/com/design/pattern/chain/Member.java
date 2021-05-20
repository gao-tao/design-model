package com.design.pattern.chain;

import lombok.Data;

@Data
public class Member {

    private String loginName;

    private String loginPass;

    private String roleName;


    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }

    @Override
    public String toString() {
        return "Member{" +
                "loginName='" + loginName + '\'' +
                ", loginPass='" + loginPass + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
