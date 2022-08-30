package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Главная программа.
     * @param args - параметры запуска.
     */
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
                //new ClassPathXmlApplicationContext("beans.xml");

        AutoFactory autoFactory = applicationContext.getBean("autoFactory", AutoFactory.class);
        autoFactory.setSize(5);
        autoFactory.runProduct();
     }
}
