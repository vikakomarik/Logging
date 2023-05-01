package org.example;
import org.testng.annotations.Test;

import static org.example.Car.*;

public class TestCar extends Car {
    @Test
    public void createCarObjects() {
        Car car1 = new Car("Honda", "orange", 1.8, 190);
        Car car2 = new Car("Suzuki", "black", 3, 250);
        Car car3 = new Car("Audi", "yellow", 2, 200);
        Car car4 = new Car("Toyota", "green", 1.6, 180);
        Car car5 = new Car("Opel", "blue", 1.8, 190);
        //Car.printCars(car1, car2, car3, car4, car5);

        TestCar carDescription = new TestCar();
        carDescription.resume(car1);
        carDescription.resume(car2);
        carDescription.resume(car3);
        carDescription.resume(car4);
        carDescription.resume(car5);

        car1.changeColor ("grey");
        car2.changeColor ("purple");
        car3.changeColor ("green");
        car4.changeColor ("silver");
        car5.changeColor ("gold");

    }
}



