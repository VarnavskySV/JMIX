package org.example;

/**
 * Класс создания седана.
 */
public class SedanProductionLine implements ProductionLine{
    /**
     * Создать седан.
     */
    @Override
    public void work() {

        System.out.println("Sedan produced!");

    }
}
