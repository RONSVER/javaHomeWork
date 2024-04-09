package org.example.prof.lessonTen.homeWorkTen.taskTwo;

import java.util.HashSet;
import java.util.Set;

public class AutoCenter {
    private Set<Car> soldCars = new HashSet<>();
    private Set<Car> leasingCars = new HashSet<>();

    public void sellCar(Car car) {
        soldCars.add(car);
    }

    public void changeRegNumber(Car car, String newRegNumber) {
        car.setRegNum(newRegNumber);
    }

    public void repaintCar(Car car, String newColor) {
        car.setColor(newColor);
    }

    public void leaseCar(Car car) {
        leasingCars.add(car);
    }

    public void resellCar(Car oldCar, Car newCar) {
        soldCars.remove(oldCar);
        soldCars.add(newCar);
    }

    public boolean isLeasingCar(Car car) {
        return leasingCars.contains(car);
    }

    public void printLeasingCars() {
        leasingCars
                .stream()
                .forEach(el -> System.out.println(el));
    }

    public void printSoldCars() {
        soldCars
                .stream()
                .forEach(el -> System.out.println(el));
    }


}
