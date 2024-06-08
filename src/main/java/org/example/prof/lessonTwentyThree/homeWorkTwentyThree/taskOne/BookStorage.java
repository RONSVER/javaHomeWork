package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskOne;

import java.util.*;
import java.util.stream.Collectors;

public class BookStorage {
/*
                            1 уровень сложности
 Часть классов книга , автор можно взять из домашней работы с книжной полкой
 Создать хранилище книг, в виде мапы.
 В этом хранилище должны быть методы получить все хранилище,
 добавить книгу в хранилище и получить книгу из хранилища по ее isbn.
 Установить размер хранилища в 10 книг.

 При добавлении книги в хранилище проверять размер хранилища и когда количество книг в хранилище
 дойдет до 10 - выбросить свое исключение(его нужно сделать )

 StorageFullException и обработать его в главной программе с понятным сообщением

 При получении книги из хранилища по isbn , если такой книги нет, выбросить NoSuchBookException и обработать его с сообщением.
*/

    final static int MAX_LENGTH_BOOK_STORAGE = 10;
    private static final String STORAGE_FULL_MESSAGE = "The book storage cannot exceed more than 10 books.";
    private static final String DUPLICATE_BOOK_MESSAGE = "There cannot be duplicates in the book storage.";
    private static final String EMPTY_STORAGE_MESSAGE = "The book storage is empty.";
    private static final String BOOK_NOT_FOUND_MESSAGE = "Book not found in the storage.";
    final Map<Number, Book> bookStorage = new HashMap<>();

    public void addBook(Book book) {
        if (bookStorage.size() >= MAX_LENGTH_BOOK_STORAGE) {
            throw new StorageFullException(STORAGE_FULL_MESSAGE);
        }

        if (bookStorage.containsKey(book.getIsbn())) {
            throw new StorageFullException(DUPLICATE_BOOK_MESSAGE);
        }

        bookStorage.put(book.getIsbn(), book);
    }

    public List<Book> getAllBookStorage() {
        if (bookStorage.isEmpty()) {
            throw new StorageFullException(EMPTY_STORAGE_MESSAGE);
        }

        return new ArrayList<>(bookStorage.values());
    }

    public List<Book> getAllBookStorage(int yearOfPublishing) {
        if (bookStorage.isEmpty()) {
            throw new StorageFullException(EMPTY_STORAGE_MESSAGE);
        }

        return bookStorage.values().stream()
                .filter(book -> book.getYearOfPublishing() == yearOfPublishing)
                .collect(Collectors.toList());
    }

    public List<Book> getAllBookStorage(String authorName) {
        if (bookStorage.isEmpty()) {
            throw new StorageFullException(EMPTY_STORAGE_MESSAGE);
        }

        return bookStorage.values().stream()
                .filter(book -> Objects.equals(book.getAuthor().getName(), authorName))
                .collect(Collectors.toList());
    }

    public Book getBookByIsbn(int isbn) {
        if (bookStorage.isEmpty()) {
            throw new StorageFullException(EMPTY_STORAGE_MESSAGE);
        }

        if (!bookStorage.containsKey(isbn)) {
            throw new NoSuchBookException(BOOK_NOT_FOUND_MESSAGE);
        }

        return bookStorage.remove(isbn);
    }
}
