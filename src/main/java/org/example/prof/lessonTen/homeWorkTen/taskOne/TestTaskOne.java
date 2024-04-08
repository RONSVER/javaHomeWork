package org.example.prof.lessonTen.homeWorkTen.taskOne;

import java.util.Scanner;

public class TestTaskOne {

    public static void main(String[] args) {
        TestTaskOne testTaskOne = new TestTaskOne();
        testTaskOne.startSortBookshelf();


    }

    private void startSortBookshelf() {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();


        while (true) {
            System.out.println("Choose sorting option:");
            System.out.println("1-By title, 2-By year of publishing, 3-By number of pages, 4-By author's year of birth");
            if (scanner.hasNextInt()) {
                bookshelf.sortChoice(scanner.nextInt());
                break;
            } else {
                System.out.println("Error Invalid data");
                break;
            }
        }
    }
}
