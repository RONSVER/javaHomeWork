package org.example.prof.lessonFourteen.homeWorkFourteen.taskThree;

import java.io.File;

public class AppDeleteSubDir {
    public static void main(String[] args) {
        // packageExample\testik - file in dir packageExample for test
        File dir = new File("D:\\BackEnd pro Tel Ran\\backEndProf\\src\\main\\java\\org\\example\\prof\\lessonFourteen\\homeWorkFourteen\\taskThree\\packageExample");

        deleteAllSubDir(dir);

        try {
            boolean isDeleteUpperDir = dir.delete();
            if (isDeleteUpperDir) {
                System.out.println("Директория успешно удален!");
            }
        } catch (SecurityException e) {
            System.out.println("Ошибка удаления директории: " + e.getMessage());

        }

    }

    public static void deleteAllSubDir(File directory) {
        if (directory != null && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        deleteAllSubDir(file);
                    } else {
                        boolean isDeleted = file.delete();
                        if (isDeleted) {
                            System.out.println("Файл успешно удален: " + file.getAbsolutePath());
                        } else {
                            System.out.println("Ошибка удаления файла: " + file.getAbsolutePath());
                        }
                    }
                }
            }
        }
    }


    public static void deleteDir(File dir) {
        // Удаление самой директории
        boolean isDeletedDir = dir.delete();
        if (isDeletedDir) {
            System.out.println("Директория успешно удалена: " + dir.getAbsolutePath());
        } else {
            System.out.println("Ошибка удаления директории: " + dir.getAbsolutePath());
        }
    }

}
