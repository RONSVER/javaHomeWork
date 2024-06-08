package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskTwo;

import org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskOne.StorageFullException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    Storage<Eat> eatStorage;

    @BeforeEach
    public void init() {
        eatStorage = new Storage<>();
    }

    @Test
    public void testGetAllProductWhenIsEmpty() {
        assertThrows(StorageEmptyException.class, () -> {
            eatStorage.getAllProduct();
        });
    }

    @Test
    public void testGetAllProducty() {
        Storage<Eat> eatStorage = new Storage<>();


        eatStorage.addProduct(new Eat(1, "Apple", "Mexican", 95));
        eatStorage.addProduct(new Eat(2, "Banana", "Africa", 105));
        eatStorage.addProduct(new Eat(3, "Spaghetti", "Italian", 205));

        List<Eat> allProduct = eatStorage.getAllProduct();
        assertEquals(3, allProduct.size());
        assertTrue(allProduct.contains(new Eat(1, "Apple", "Mexican", 95)));
        assertTrue(allProduct.contains(new Eat(2, "Banana", "Africa", 105)));
        assertTrue(allProduct.contains(new Eat(3, "Spaghetti", "Italian", 205)));
    }

    @Test
    public void testGetProductByIdWhenIsEmpty() {
        assertThrows(StorageEmptyException.class, () -> {
            eatStorage.getProductById(3);
        });
    }

    @Test
    public void testGetProductByIdWhenProductNotFound() {
        eatStorage.addProduct(new Eat(1, "Apple", "Mexican", 95));

        assertThrows(ProductNotFoundException.class, () -> {
            eatStorage.getProductById(3);
        });
    }

    @Test
    public void testGetProductById() {
        eatStorage.addProduct(new Eat(1, "Apple", "Mexican", 95));

        assertEquals(new Eat(1, "Apple", "Mexican", 95), eatStorage.getProductById(1));
    }

    @Test
    public void testAddProductWhenStorageOverflow() {
        eatStorage.addProduct(new Eat(1, "Apple", "Mexican", 95));
        eatStorage.addProduct(new Eat(2, "Banana", "Africa", 105));
        eatStorage.addProduct(new Eat(3, "Spaghetti", "Italian", 205));
        eatStorage.addProduct(new Eat(4, "Burger", "USA", 355));
        eatStorage.addProduct(new Eat(5, "Borsch", "SNG", 105));

        assertThrows(StorageOverflowException.class, () -> {
            eatStorage.addProduct(new Eat(6, "Fish", "spain", 55));
        });
    }

    @Test
    public void testAddProduct() {
        eatStorage.addProduct(new Eat(1, "Apple", "Mexican", 95));

        assertEquals(1, eatStorage.getAllProduct().size());
    }
}