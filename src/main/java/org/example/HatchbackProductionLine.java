package org.example;

/**
 * Класс создания хэтчбека.
 */
public class HatchbackProductionLine implements ProductionLine{
    /**
     * Создать хэтчбек.
     */
    @Override
    public void work() {

        System.out.println("Hatchback produced!");

    }

}
