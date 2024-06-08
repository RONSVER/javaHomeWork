package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskOne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookStorageTest {

    BookStorage bookStorage;

    @BeforeEach
    public void init() {
        bookStorage = new BookStorage();
    }


    @Test
    public void testAddBookWhenBookStorageOverflow() {
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2008, 464, new Author("Robert C. Martin", 1952)));
        bookStorage.addBook(new Book(97803212, "The Pragmatic Programmer: Your Journey to Mastery", 1999, 352, new Author("Andrew Hunt", 1964)));
        bookStorage.addBook(new Book(97802013, "Design Patterns: Elements of Reusable Object-Oriented Software", 1994, 416, new Author("Erich Gamma", 1961)));
        bookStorage.addBook(new Book(97802014, "Refactoring: Improving the Design of Existing Code", 1999, 431, new Author("Martin Fowler", 1963)));
        bookStorage.addBook(new Book(97805965, "Head First Design Patterns: A Brain-Friendly Guide", 2004, 694, new Author("Eric Freeman", 1957)));
        bookStorage.addBook(new Book(97802016, "Programming Pearls", 1999, 256, new Author("Jon Bentley", 1953)));
        bookStorage.addBook(new Book(97802017, "The Mythical Man-Month: Essays on Software Engineering", 1975, 322, new Author("Frederick P. Brooks Jr.", 1931)));
        bookStorage.addBook(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 2019, 352, new Author("Andrew Hunt", 1964)));
        bookStorage.addBook(new Book(97802019, "Structure and Interpretation of Computer Programs", 1984, 657, new Author("Harold Abelson", 1947)));
        bookStorage.addBook(new Book(78020110, "Introduction to Algorithms", 1990, 1312, new Author("Thomas H. Cormen", 1956)));
        assertThrows(StorageFullException.class, () ->
                bookStorage.addBook(new Book(12313123, "Error book storage overflow", 2024, 0, new Author("RONSVER", 333))));
    }

    @Test
    public void testAddBookWhenBookStorageHaveDuplicate() {
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2008, 464, new Author("Robert C. Martin", 1952)));
        assertThrows(StorageFullException.class, () ->
                bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2008, 464, new Author("Robert C. Martin", 1952))));

    }

    @Test
    public void testAddBook() {
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2008, 464, new Author("Robert C. Martin", 1952)));
        assertEquals(1, bookStorage.bookStorage.size());
    }

    @Test
    public void testGetAllBookStorageWhenBookStorageIsEmpty() {
        assertThrows(StorageFullException.class, () -> bookStorage.getAllBookStorage());
    }

    // повторить как работатет hashCode

    @Test
    public void testGetAllBookStorage() {
        bookStorage.addBook(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 2019, 352, new Author("Andrew Hunt", 1964)));
        bookStorage.addBook(new Book(97802019, "Structure and Interpretation of Computer Programs", 1984, 657, new Author("Harold Abelson", 1947)));
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2008, 464, new Author("Robert C. Martin", 1952)));

        List<Book> bookList = bookStorage.getAllBookStorage();
        assertEquals(3, bookList.size());
        assertTrue(bookList.contains(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 2019, 352, new Author("Andrew Hunt", 1964))));
        assertTrue(bookList.contains(new Book(97802019, "Structure and Interpretation of Computer Programs", 1984, 657, new Author("Harold Abelson", 1947))));
        assertTrue(bookList.contains(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2008, 464, new Author("Robert C. Martin", 1952))));
    }

    @Test
    public void testGetAllBookStorageByYearOfPublishingWhenIsEmpty() {
        assertThrows(StorageFullException.class, () -> bookStorage.getAllBookStorage(2019));
    }

    @Test
    public void testGetAllBookStorageByYearOfPublishing() {
        bookStorage.addBook(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 2019, 352, new Author("Andrew Hunt", 1964)));
        bookStorage.addBook(new Book(97802019, "Structure and Interpretation of Computer Programs", 2019, 657, new Author("Harold Abelson", 1947)));
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2018, 464, new Author("Robert C. Martin", 1952)));

        List<Book> bookList = bookStorage.getAllBookStorage(2019);
        assertEquals(2, bookList.size());
        assertTrue(bookList.contains(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 2019, 352, new Author("Andrew Hunt", 1964))));
        assertTrue(bookList.contains(new Book(97802019, "Structure and Interpretation of Computer Programs", 2019, 657, new Author("Harold Abelson", 1947))));
    }

    @Test
    public void testGetAllBookStorageBynNameAuthorWhenIsEmpty() {
        assertThrows(StorageFullException.class, () -> bookStorage.getAllBookStorage("Andrew Hunt"));
    }

    @Test
    public void testGetAllBookStorageByNameAuthor() {
        bookStorage.addBook(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 2019, 352, new Author("Andrew Hunt", 1964)));
        bookStorage.addBook(new Book(97802019, "Structure and Interpretation of Computer Programs", 2019, 657, new Author("Andrew Hunt", 1947)));
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2018, 464, new Author("Robert C. Martin", 1952)));

        List<Book> bookList = bookStorage.getAllBookStorage("Andrew Hunt");
        assertEquals(2, bookList.size());
        assertTrue(bookList.contains(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 1019, 352, new Author("Andrew Hunt", 1964))));
        assertTrue(bookList.contains(new Book(97802019, "Structure and Interpretation of Computer Programs", 2078, 657, new Author("Andrew Hunt", 1947))));
    }

    @Test
    public void testGetBookByIsbnWhenBookStorageIsEmpty() {
        assertThrows(StorageFullException.class, () -> bookStorage.getBookByIsbn(97805538));
    }

    @Test
    public void testGetBookByIsbnWhenNotFound() {
        bookStorage.addBook(new Book(97802019, "Structure and Interpretation of Computer Programs", 2019, 657, new Author("Andrew Hunt", 1947)));
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2018, 464, new Author("Robert C. Martin", 1952)));
        assertThrows(NoSuchBookException.class, () -> bookStorage.getBookByIsbn(87805538));
    }

    @Test
    public void testGetBookByIsbn() {
        bookStorage.addBook(new Book(97802019, "Structure and Interpretation of Computer Programs", 2019, 657, new Author("Andrew Hunt", 1947)));
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2018, 464, new Author("Robert C. Martin", 1952)));
        assertEquals(new Book(97802019, "Structure and Interpretation of Computer Programs", 2019, 657, new Author("Andrew Hunt", 1947)), bookStorage.getBookByIsbn(97802019));
    }
}