package com.springApp.springIoC;

import org.springframework.context.ApplicationListener;

/**
 * EventHandler implementation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyEventHandler implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println(myEvent.toString());
    }
}
