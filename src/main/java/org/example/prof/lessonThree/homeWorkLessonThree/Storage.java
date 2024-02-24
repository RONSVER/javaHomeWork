package org.example.prof.lessonThree.homeWorkLessonThree;

import org.example.prof.lessonThree.homeWorkLessonThree.productsClasses.Product;

public class Storage {



    private Product[] products;
    private int countProducts;

    public Storage(int capacity) {
        products = new Product[capacity];
        countProducts = 0;
    }

    public void loadProductsStorage(Product product) {
        if (product != null) {
            if (countProducts < products.length) {
                if (!isProductAlreadyLoaded(product)) { // Проверяем, был ли уже такой продукт загружен
                    products[countProducts++] = product;
                    System.out.println("Продукт '" + product.getName() + "' успешно загружен на склад.");
                } else {
                    System.out.println("Продукт '" + product.getName() + "' уже загружен на склад.");
                }
            } else {
                System.out.println("Склад заполнен, невозможно загрузить новый продукт.");
            }
        } else {
            System.out.println("Ошибка: Попытка загрузить на склад null продукт.");
        }
    }

    private boolean isProductAlreadyLoaded(Product product) {
        for (int i = 0; i < countProducts; i++) {
            if (products[i] != null && products[i].getName().equals(product.getName())) {
                return true; // Продукт уже загружен на склад
            }
        }
        return false; // Продукт еще не загружен на склад
    }


    public int getCountProducts() {
        return countProducts;
    }

    public Product unLoadProductStorage() {
        if (countProducts > 0) {
            Product product = products[--countProducts];
            products[countProducts] = null;
            return product;
        } else {
            System.out.println("Склад пуст.");
            return null;
        }
    }

    public void unloadAllProducts() {
        for (int i = 0; i < countProducts; i++) {
            products[i] = null;
        }
        countProducts = 0;
        System.out.println("Все продукты выгружены со склада.");
    }

    public void displayAllProductsStorage() {
        System.out.println("Продукты на складе:");
        System.out.println(countProducts);
        int displayLimit = Math.min(countProducts, products.length);
        for (int i = 0; i < displayLimit; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            }
        }
    }

    public void decrementCountProducts(int amount) {
        countProducts -= amount;
    }

    public void incrementCountProducts(int amount) {
        countProducts += amount;
    }
}
