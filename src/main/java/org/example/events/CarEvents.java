package org.example.events;

import org.springframework.context.ApplicationEvent;

/**
 * События для авто.
 */
public class CarEvents extends ApplicationEvent {
    /**
     * Сообщение .
     */
    private String message;

    /**
     * Конструктор.
     * @param source - объект.
     */
    public CarEvents(Object source) {
        super(source);
    }

    /**
     * Получить сообщеие.
     * @return - сообщение.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Установить сообщение.
     * @param message - сообщение.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
