package org.example;

public class AutoFactory {

    /**
     * Размерность производства.
     */
    private final int size;
    /**
     * Производственная линия.
     */
    private final ProductionLine productionLine;

    /**
     * Конструктор
     * @param size - размер линии
     * @param productionLine - Вид конвеера.
     */
    public AutoFactory(int size, ProductionLine productionLine) {
        this.size = size;
        this.productionLine = productionLine;
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
        System.out.printf("Produced %d count", i);
    }
}
