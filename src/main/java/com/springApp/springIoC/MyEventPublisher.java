package com.springApp.springIoC;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * EventPublisher implementation
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MyEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent() {
        MyEvent myEvent = new MyEvent(this);
        publisher.publishEvent(myEvent);
    }

}
