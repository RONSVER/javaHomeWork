package org.example.prof.lessonTen.homeWorkTen.taskOne;

import java.util.*;

public class Bookshelf {
  private List<Book> books = Arrays.asList(
          new Book("Преступление и наказание", 1866, 528, new Author("Федор Достоевский", 1821)),
          new Book("Мастер и Маргарита", 1967, 480, new Author("Михаил Булгаков", 1891)),
          new Book("Война и мир", 1869, 1225, new Author("Лев Толстой", 1828)),
          new Book("451 градус по Фаренгейту", 1953, 158, new Author("Рэй Брэдбери", 1920)),
          new Book("Маленький принц", 1943, 96, new Author("Антуан де Сент-Экзюпери", 1900)),
          new Book("1984", 1949, 328, new Author("Джордж Оруэлл", 1903)),
          new Book("Атлант расправил плечи", 1957, 1200, new Author("Айн Рэнд", 1905)),
          new Book("Вишневый сад", 1904, 88, new Author("Антон Чехов", 1860)),
          new Book("Анна Каренина", 1877, 864, new Author("Лев Толстой", 1828)),
          new Book("О дивный новый мир", 1932, 288, new Author("Олдос Хаксли", 1894))
          );

    public void bookSort(Comparator<Book> comparator) {
        Collections.sort(books, comparator);
        System.out.println(books);
    }


    public void sortChoice(int num) {
        switch (num) {
            case 1:
                System.out.println("Sort by title:");
                System.out.println("----------------------");
                bookSort((Book o1, Book o2) -> o1.getTitle().compareTo(o2.getTitle()));
                System.out.println("----------------------");
                break;
            case 2:
                System.out.println("Sort by year of publishing:");
                System.out.println("----------------------");
                bookSort((Book o1, Book o2) -> o1.getYearOfPublishing() - o2.getYearOfPublishing());
                System.out.println("----------------------");
                break;
            case 3:
                System.out.println("Sort by number of pages:");
                System.out.println("----------------------");
                bookSort((Book o1, Book o2) -> o1.getNumberOfPages() - o2.getNumberOfPages());
                System.out.println("----------------------");
                break;
            case 4:
                System.out.println("Sort by author year of birth:");
                System.out.println("----------------------");
                bookSort((Book o1, Book o2) -> o1.getAuthor().getYearOfBirth() - o2.getAuthor().getYearOfBirth());
                System.out.println("----------------------");
                break;
            default:
                System.out.println("invalid choice sorted by title:");
                System.out.println("----------------------");
                bookSort((Book o1, Book o2) -> o1.getTitle().compareTo(o2.getTitle()));
                System.out.println("----------------------");
        }
    }
}
