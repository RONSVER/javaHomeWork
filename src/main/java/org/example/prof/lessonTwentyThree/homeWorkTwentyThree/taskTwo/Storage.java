package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskTwo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage<T extends Identifiable> {
    /*
        Создать склад Storage.
        Склад должен иметь коллекцию , в которой должен хранить объекты определенного класса Eat(поля придумайте любый)
        У склада должны быть методы получить объекты - все, получить объекты по Id объекты и метод добавить объекты на склад.
        Добавить ограничения по размеру склада и обрабатывать три исключения (Склад полон, склад пуст ничего нет, нет объекта)
    */
    final private static int MAX_SIZE_STORAGE = 5;

    private static final String STORAGE_FULL_MESSAGE = "The storage cannot exceed more than 5 products.";

    private static final String EMPTY_STORAGE_MESSAGE = "The storage is empty.";

    private static final String PRODUCT_NOT_FOUND_MESSAGE = "Product not found in the storage.";

    Map<Integer, T> map = new HashMap<>();

    public List<T> getAllProduct() {
        if (map.isEmpty()) {
            throw new StorageEmptyException(EMPTY_STORAGE_MESSAGE);
        }

        return map.values().stream()
                .toList();
    }

    public T getProductById(int id) {
        if (map.isEmpty()) {
            throw new StorageEmptyException(EMPTY_STORAGE_MESSAGE);
        }

        if (!map.containsKey(id)) {
            throw new ProductNotFoundException(PRODUCT_NOT_FOUND_MESSAGE);
        }

        return map.remove(id);
    }

    public void addProduct(T product) {
        if (map.size() >= MAX_SIZE_STORAGE) {
            throw new StorageOverflowException(STORAGE_FULL_MESSAGE);
        }

        map.put(product.getIdentifiable(), product);
    }
}
