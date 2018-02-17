package com.springApp.springIoC;

import org.springframework.context.ApplicationEvent;

/**
 * Custom event
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "This event is created by me.";
    }
}
