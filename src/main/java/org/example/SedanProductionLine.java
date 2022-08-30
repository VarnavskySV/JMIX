package org.example;

import org.springframework.stereotype.Component;

/**
 * Класс создания седана.
 */
@Component("sedanPL")
public class SedanProductionLine implements ProductionLine{
    /**
     * Создать седан.
     */
    @Override
    public void work() {

        Car.createCar();

        System.out.println("Sedan produced!");

    }

}
