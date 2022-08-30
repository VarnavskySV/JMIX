package org.example;

import org.example.events.CarEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *  Класс автомобиль.
 */
public class Car {

    /**
     * Количесвто произведенных автомобилей.
      */
    static int carsBuilt = 0;

    /**
     * Установить carsBuilt.
     * @param carsBuilt - параметр.
     */
    public static void setCarsBuilt(int carsBuilt) {
        Car.carsBuilt = carsBuilt;
    }

    /**
     * Вернуть carsBuilt
     * @return - параметр.
     */
    public static int getCarsBuilt() {
        return carsBuilt;
    }

    /**
     * Bean публикатор.
     */
    @Autowired
    private CarEventPublisher carEventPublisher;


    /**
     * Для случайного заполнения.
     */
    boolean partsDelivered = false;
    /**
     * Конструктор.
     */
    public Car() {

    }

    /**
     * Получение рандомного типа boolean.
     * @return - Значение.
     */
    static private boolean randomBoolean(){
        return Math.random() < 0.5;
    }

    /**
     * Возвращает partsDelivered.
     * @return - partsDelivered.
     */
    public boolean isPartsDelivered() {
        return partsDelivered;
    }

    /**
     * Устанавивает partsDelivered.
     * @param partsDelivered - параметр partsDelivered.
     */
    public void setPartsDelivered(boolean partsDelivered) {
        this.partsDelivered = partsDelivered;
        if ( this.partsDelivered ){
            int cnt = getCarsBuilt();
            cnt++;
            setCarsBuilt(cnt);

            createPublish();

        }
    }

    /**
     *  Установить сообщение.
     */
    public void createPublish(){

        //carEventPublisher.publishCarEvent("New car created.");

    }
    /**
     * Создает сам себя и ставит поле partsDelivered.
     */
    static void createCar(){
        Car car = new Car();
        if (Car.randomBoolean()){
            car.setPartsDelivered(true);

        }
    }
}
