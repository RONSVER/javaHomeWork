package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskOne;

public class BookStorageApp {

    //  В коде основной программы сделать две опции - добавить книгу и получить книгу по isbn
    static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
//        addBookInBookStorage(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2008, 464, new Author("Robert C. Martin", 1952)));
//        addBookInBookStorage(new Book(97803212, "The Pragmatic Programmer: Your Journey to Mastery", 1999, 352, new Author("Andrew Hunt", 1964)));
//        addBookInBookStorage(new Book(97802013, "Design Patterns: Elements of Reusable Object-Oriented Software", 1994, 416, new Author("Erich Gamma", 1961)));
//        addBookInBookStorage(new Book(97802014, "Refactoring: Improving the Design of Existing Code", 1999, 431, new Author("Martin Fowler", 1963)));
//        addBookInBookStorage(new Book(97805965, "Head First Design Patterns: A Brain-Friendly Guide", 2004, 694, new Author("Eric Freeman", 1957)));
//        addBookInBookStorage(new Book(97802016, "Programming Pearls", 1999, 256, new Author("Jon Bentley", 1953)));
//        addBookInBookStorage(new Book(97802017, "The Mythical Man-Month: Essays on Software Engineering", 1975, 322, new Author("Frederick P. Brooks Jr.", 1931)));
//        addBookInBookStorage(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 2019, 352, new Author("Andrew Hunt", 1964)));
//        addBookInBookStorage(new Book(97802019, "Structure and Interpretation of Computer Programs", 1984, 657, new Author("Harold Abelson", 1947)));
//        addBookInBookStorage(new Book(78020110, "Introduction to Algorithms", 1990, 1312, new Author("Thomas H. Cormen", 1956)));

        bookStorage.addBook(new Book(97805538, "The Pragmatic Programmer: 20th Anniversary Edition", 2019, 352, new Author("Andrew Hunt", 1964)));
        bookStorage.addBook(new Book(97802019, "Structure and Interpretation of Computer Programs", 1984, 657, new Author("Harold Abelson", 1947)));
        bookStorage.addBook(new Book(97801321, "Clean Code: A Handbook of Agile Software Craftsmanship", 2008, 464, new Author("Robert C. Martin", 1952)));

//        System.out.println(getBookInBookStorageByIsbn(78020110));
        System.out.println(bookStorage.getAllBookStorage());
//        System.out.println(bookStorage.getAllBookStorage("Jon Bentley"));
    }

    public static void addBookInBookStorage(Book book) {
        bookStorage.addBook(book);
    }

    public static Book getBookInBookStorageByIsbn(int isbn) {
        return bookStorage.getBookByIsbn(isbn);
    }
}
