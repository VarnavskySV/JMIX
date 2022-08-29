package org.example;

/**
 *  Класс автомобиль.
 */
public class Car {

    /**
     * Количесвто произведенных автомобилей.
      */
    static int carCount = 0;

    /**
     * Конструктор.
     */
    public Car() {

            int cnt = Car.getCarCount();

            cnt++;

            Car.setCarCount(cnt);

    }

    public static void setCarCount(int carCount) {
        Car.carCount = carCount;
    }

    public static int getCarCount() {
        return carCount;
    }

}
