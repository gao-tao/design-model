package com.design.pattern.mediator.chatroom;

public class Test {

    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();
        User tom = new User("tom", chatRoom);
        User jack = new User("jack", chatRoom);
        tom.sendMessage("hello! 我是tom");
        jack.sendMessage("hello! 我是jack");
    }
}
