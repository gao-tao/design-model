package com.design.pattern.chain.builderchain;

import com.design.pattern.chain.Member;

public class LoginHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        member.setRoleName("管理员");
        System.out.println("登录成功！");
        handler.doHandler(member);
    }
}
