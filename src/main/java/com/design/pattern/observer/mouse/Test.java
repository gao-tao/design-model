package com.design.pattern.observer.mouse;

import org.springframework.web.context.ContextLoaderListener;

public class Test {


    public static void main(String[] args) {

        EventListener listener = new MouseEventListener();
        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK, listener);
        mouse.addListener(MouseEventType.ON_MOVE, listener);

        mouse.click();
        mouse.move();
    }
}
