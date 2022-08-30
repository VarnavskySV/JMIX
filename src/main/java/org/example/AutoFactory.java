package org.example;

import org.example.events.CarEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Фабрика автомобилей.
 */
@Component
public class AutoFactory {


    /**
     * Размерность производства.
     */
    private int size;
    /**
     * Производственная линия.
     */
    private ProductionLine productionLine;

    @Autowired
    public AutoFactory(@Qualifier("sedanPL") ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    /**
     * Конструктор
     * @param size - размер линии
     * @param productionLine - Вид конвеера.
     */
    public AutoFactory(int size, ProductionLine productionLine) {
        this.size = size;
        this.productionLine = productionLine;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Запуск производства.
     */
    public void runProduct(){
        int i = 0;
        while (i<size){

            productionLine.work();

            i++;

        }
        System.out.printf("Produced %d count", Car.getCarsBuilt());
    }
}
