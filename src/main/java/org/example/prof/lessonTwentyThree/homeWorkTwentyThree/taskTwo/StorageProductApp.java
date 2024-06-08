package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskTwo;

public class StorageProductApp {

    public static void main(String[] args) {
        Storage<Eat> eatStorage = new Storage<>();

        eatStorage.addProduct(new Eat(1, "Apple", "Mexican", 95));
        eatStorage.addProduct(new Eat(2, "Banana", "Africa", 105));
        eatStorage.addProduct(new Eat(3, "Spaghetti", "Italian", 205));
        eatStorage.addProduct(new Eat(4, "Burger", "USA", 355));
        eatStorage.addProduct(new Eat(5, "Borsch", "SNG", 105));

        System.out.println("All products (Eat): " + eatStorage.getAllProduct());
        System.out.println("Retrieved product (Eat): " + eatStorage.getProductById(3));
        System.out.println();

        Storage<Drink> drinkStorage = new Storage<>();

        drinkStorage.addProduct(new Drink(1, "Coca-Cola", "USA", 1));
        drinkStorage.addProduct(new Drink(2, "Pepsi", "USA", 1));
        drinkStorage.addProduct(new Drink(3, "Fanta", "Germany", 1));
        drinkStorage.addProduct(new Drink(4, "Sprite", "USA", 1));
        drinkStorage.addProduct(new Drink(5, "Mountain Dew", "USA", 1));

        System.out.println("All products (Drink): " + drinkStorage.getAllProduct());
        System.out.println("Retrieved product (Drink): " + drinkStorage.getProductById(5));
    }
}
