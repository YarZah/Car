package org.example;

import Car.Car;
import Car.CarModel;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car carNew = new Car(0.5, 4.5, CarModel.BMW, LocalDate.of(2024, 10, 26));
        System.out.println("Створено нове авто " + carNew.toString());
        if (carNew.isAllowed()) {
            System.out.println("Експлуатація можлива");
        } else {
            System.out.println("Експлуатація не можлива");
        }
        carNew.drive();

    }

}

