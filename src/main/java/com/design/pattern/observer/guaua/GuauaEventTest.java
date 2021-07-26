package com.design.pattern.observer.guaua;

import com.google.common.eventbus.EventBus;

public class GuauaEventTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();

        eventBus.register(guavaEvent);
        eventBus.post("snail");
    }
}
