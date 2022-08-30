package org.example.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Публикатр событий.
 */
@Component
public class CarEventPublisher {
    /**
     * Bean публикатор.
     */
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * Метод публикации сообщения.
     * @param message - текст.
     */
    public void publishCarEvent(String message){

        System.out.println("message : "+ message);

        applicationEventPublisher.publishEvent(new CarEvents(this, message));
        
    }
}
