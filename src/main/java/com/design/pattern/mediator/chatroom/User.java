package com.design.pattern.mediator.chatroom;

import lombok.Getter;

public class User {

    @Getter
    private String name;

    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String msg) {
        this.chatRoom.showMsg(this, msg);
    }
}
