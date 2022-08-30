package org.example;

import org.example.events.CarEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Класс создания седана.
 */
@Component("sedanPL")
public class SedanProductionLine implements ProductionLine{
    /**
     * Bean публикатор.
     */
    @Autowired
    private CarEventPublisher carEventPublisher;

    /**
     * Создать седан.
     */
    @Override
    public void work() {

        Car car = Car.createCar();

        if (car.isPartsDelivered()){

            createPublish();

        }


        System.out.println("Sedan produced!");

    }
    /**
     *  Установить сообщение.
     */
    public void createPublish(){

        carEventPublisher.publishCarEvent("New car created.");

    }

}
