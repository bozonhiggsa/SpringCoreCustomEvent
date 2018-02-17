package com.springApp.springIoC;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyEventRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my-event-config.xml");

        MyEventPublisher myEventPublisher = (MyEventPublisher) context.getBean("myEventPublisher");
        myEventPublisher.publishEvent();
    }
}
