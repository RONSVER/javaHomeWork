package org.example.prof.lessonFourteen.homeWorkFourteen.taskOne;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class First_Task_Create_File {
/*
    Создайте файл, используя FileOutputStream,
    с текстом: "This is my first experience when I myself work with IO API. I can do everything!"
*/

    public static void main(String[] args) throws FileNotFoundException {
        String text = "This is my first experience when I myself work with IO API. I can do everything!";
        String pathToCreateFile = "D:\\BackEnd pro Tel Ran\\backEndProf\\src\\main\\java\\org\\example\\prof\\lessonFourteen\\homeWorkFourteen\\taskOne\\package_for_test\\test.txt";

        try (FileOutputStream fos = new FileOutputStream(pathToCreateFile)) {
            byte[] bytes = text.getBytes();
            fos.write(bytes);
            System.out.println("Файл успешно создан!!!");
        } catch (IOException exception) {
            System.err.println("Ошибка при создании файла: " + exception.getMessage());
        }
    }

}
