package org.example.prof.lessonTen.homeWorkTen.taskTwo;

public class TestTaskTwo {
    public static void main(String[] args) {
        // Создаем несколько объектов класса Car
        Car car1 = new Car("Toyota", "Blue", "VIN123", "ABC123");
        Car car2 = new Car("Honda", "Red", "VIN456", "DEF456");
        Car car3 = new Car("Ford", "Green", "VIN789", "GHI789");

        // Создаем объект класса AutoCenter
        AutoCenter autoCenter = new AutoCenter();

        // Продаем автомобили car1 и car2
        autoCenter.sellCar(car1);
        autoCenter.sellCar(car2);

        // Добавляем автомобиль car3 в лизинг
        autoCenter.leaseCar(car3);

        // Выводим список проданных автомобилей
        System.out.println("Проданные автомобили:");
        autoCenter.printSoldCars();
        System.out.println();

        // Выводим список автомобилей в лизинге
        System.out.println("Автомобили в лизинге:");
        autoCenter.printLeasingCars();
        System.out.println();

        // Изменяем регистрационный номер и перекрашиваем автомобиль в лизинге
        System.out.println("Изменяем регистрационный номер и перекрашиваем автомобиль в лизинге:");
        autoCenter.changeRegNumber(car3, "JKL012");
        autoCenter.repaintCar(car3, "Yellow");
        autoCenter.printLeasingCars();
        System.out.println();

        // Проверяем, находится ли автомобиль в лизинге
        System.out.println("Проверяем, находится ли автомобиль в лизинге:");
        System.out.println("Car3 находится в лизинге? " + autoCenter.isLeasingCar(car3));
        System.out.println("Car2 находится в лизинге? " + autoCenter.isLeasingCar(car2));
    }
}
