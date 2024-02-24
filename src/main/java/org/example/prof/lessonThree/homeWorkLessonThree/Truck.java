package org.example.prof.lessonThree.homeWorkLessonThree;

import org.example.prof.lessonThree.homeWorkLessonThree.productsClasses.Product;

public class Truck {



    private Product[] products;
    private int countProducts;

    public Truck(int capacity) {
        products = new Product[capacity];
        countProducts = 0;
    }



    public void storageLoadProductToTruck(Storage storage) {
        if (storage != null) {
            int remainingCapacity = products.length - countProducts;
            if (remainingCapacity == 0) {
                System.out.println("Трак полностью загружен, невозможно добавить еще продукты.");
                return;
            }
            int productsToLoad = Math.min(remainingCapacity, storage.getCountProducts());
            if (productsToLoad == 0) {
                System.out.println("На складе нет продуктов для загрузки в трак.");
                return;
            }
            for (int i = 0; i < productsToLoad; i++) {
                products[countProducts++] = storage.unLoadProductStorage();
            }
            System.out.println("Продукты успешно загружены в трак.");
            storage.decrementCountProducts(productsToLoad); // Уменьшаем количество продуктов на складе
        } else {
            System.out.println("Ошибка: склад не указан.");
        }
    }

    public void unloadAllProducts(Storage storage) {
        if (storage != null) {
            for (int i = 0; i < countProducts; i++) {
                if (products[i] != null) {
                    storage.loadProductsStorage(products[i]);
                    products[i] = null;
                }
            }
            System.out.println("Все продукты выгружены с трака на склад.");
            storage.incrementCountProducts(countProducts); // Увеличиваем количество продуктов на складе
            countProducts = 0; // Сбрасываем количество продуктов в грузовике
        } else {
            System.out.println("Ошибка: склад не указан.");
        }
    }


    public void displayAllTruck() {
        System.out.println("Продукты в траке:");
        System.out.println(countProducts);
        for (int i = 0; i < countProducts; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            }
        }
    }


}
