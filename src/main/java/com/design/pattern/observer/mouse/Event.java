package com.design.pattern.observer.mouse;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.lang.reflect.Method;

/**
 * 标准事件源格式的定义
 */
@Accessors(chain = true)
@Data
public class Event {

    //事件源，动作是由谁发出的
    private Object source;

    //事件触发，要通知谁（观察者）
    private EventListener target;

    //观察者给的回应
    private Method callback;

    //事件的名称
    private String trigger;

    //事件的触发时间
    private long time;

    public Event(EventListener target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
