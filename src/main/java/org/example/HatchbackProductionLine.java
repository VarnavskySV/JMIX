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

        Car car = Car.createCar();

        System.out.println("Hatchback produced!");

    }

}
