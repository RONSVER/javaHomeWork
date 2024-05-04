package org.example.prof.lessonFourteen.homeWorkFourteen.taskTwo;

import java.io.File;
import java.io.IOException;

public class CreatesFilesWithClass {
    /*
        Создайте файл используя new File() в каталоге Desktop, убедитесь, что файл существует, удалите файл.
    */
    public static void main(String[] args) {
        String pathToCreateDir = "D:\\BackEnd pro Tel Ran\\backEndProf\\src\\main\\java\\org\\example\\prof\\lessonFourteen\\homeWorkFourteen\\taskTwo\\Desktop";
        String pathToCreateFile = "D:\\BackEnd pro Tel Ran\\backEndProf\\src\\main\\java\\org\\example\\prof\\lessonFourteen\\homeWorkFourteen\\taskTwo\\Desktop\\example.txt";


        File dirDesktop = new File(pathToCreateDir);
        File fileExample = new File(pathToCreateFile);

        try {
            boolean isMkdir = dirDesktop.mkdir();

            if (isMkdir) {
                System.out.println("Файл успешно создан в каталоге " + dirDesktop.getName());
            }

        } catch (Exception e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
        }


        try {
            boolean isCreateFile = fileExample.createNewFile();

            if (isCreateFile) {
                System.out.println("Файл успешно создан в каталоге " + dirDesktop.getName());
            }
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
        }

        if (fileExample.exists()) {
            System.out.println("Файл " + fileExample.getName() + " существует в каталоге " + dirDesktop.getName());
            System.out.println("Он будет удален!");

            try {
                fileExample.delete();
                System.out.println("Файл успешно удален!");
            } catch (SecurityException e) {
                System.out.println("Exception: " + e.getMessage());
            }


        } else {
            System.err.println("Файл не был найден!");
        }
    }
}
