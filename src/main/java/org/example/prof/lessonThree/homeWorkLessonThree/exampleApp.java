package org.example.prof.lessonThree.homeWorkLessonThree;

import org.example.prof.lessonThree.homeWorkLessonThree.productsClasses.Product;

import java.util.Scanner;


public class exampleApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Storage departureStorage = new Storage(10);
        Storage deliveryStorage = new Storage(10);

        System.out.println("Введите названия продуктов для загрузки на склад отправления:");
        System.out.println("что бы остановить добавление продуктов напишите 'stop'");
        for (int i = 0; i < 100; i++) {
            System.out.println("Продукт " + (i + 1) + ": ");
            String productName = scan.nextLine();
            if (productName.equals("stop")) {
                break;
            }
            departureStorage.loadProductsStorage(new Product(productName));
        }

        System.out.print("Введите тип трака (Big, Medium, Small): ");
        String truckType = scan.nextLine();
        Truck truck;

        switch (truckType.toLowerCase()) {
            case "big":
                truck = new Truck(15);
                break;
            case "medium":
                truck = new Truck(10);
                break;
            case "small":
                truck = new Truck(5);
                break;
            default:
                System.out.println("Неправильный тип трака.");
                return;
        }

        if (truck != null) {
            truck.storageLoadProductToTruck(departureStorage);
            System.out.println("------------");
            System.out.println("Display All Truck");
            System.out.println("------------");
            truck.displayAllTruck();
            System.out.println("------------");
            System.out.println("Unload All Products");
            System.out.println("------------");
            truck.unloadAllProducts(deliveryStorage);
            System.out.println("------------");
            System.out.println("Products Storage");
            System.out.println("------------");
            deliveryStorage.displayAllProductsStorage();
            System.out.println("------------");

        } else {
            System.out.println("Ошибка: Трак не выбран.");
        }

    }
}
