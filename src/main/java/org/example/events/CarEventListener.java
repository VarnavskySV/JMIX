package org.example.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Листенер сообщений.
 */
@Component
public class CarEventListener implements ApplicationListener<CarEvents> {
    /**
     * onApplicationEvent .
     * @param event - объект событие.
     */
    @Override
    public void onApplicationEvent(CarEvents event) {

        System.out.println("recieved:" + event.getMessage());

    }
}
