package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.internal.protocols.Input;
import java.util.Objects;

public class Car {
    public String brand;
    public String color;
    public double enginePower;
    public int maxSpeed;
    static int counter;

    Car() {
        counter++;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Car(String brand, String color, double engVolume) {
        this.brand = brand;
        this.color = color;
        enginePower = engVolume;
    }

    public Car(String brand, String color, double engVolume, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        enginePower = engVolume;
        this.maxSpeed = maxSpeed;
    }

    public static void printCars(Car... cars) {
        for (Car car : cars) {
            System.out.println("Brand: " + car.brand + ", Color: " + car.color + ", Engine Volume: " + car.enginePower + ", Max Speed: " + car.maxSpeed);
        }
    }

    public void setColor(String black) {
    }

    public class Main {
        public void main(String[] args) {

            Car[] cars = new Car[3];
            for (int i = 0; i < 3; i++) {
                cars[i] = new Car("Volvo", "red", 3.0, 300);
            }

            System.out.println(Car.counter);

            Car.printCars(cars);
        }

    }
    public void changeColor(String newColor) {
        this.color = newColor;
        if(newColor == "gold") {
            LOG.error("New car color is: {}", newColor);
        }
        else
        LOG.info("New car color is: {}", newColor);
    }

    private final Logger LOG = LoggerFactory.getLogger(TestCar.class);

    public void resume(Car car) {
        LOG.info("Car description: {}", "Brand: " + car.brand + ", Color: " + car.color + ", Engine Volume: " + car.enginePower + ", Max Speed: " + car.maxSpeed);

    }


}



