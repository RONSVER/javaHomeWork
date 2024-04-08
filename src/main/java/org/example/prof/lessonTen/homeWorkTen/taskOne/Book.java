package org.example.prof.lessonTen.homeWorkTen.taskOne;

public class Book {
    private String title;
    private int yearOfPublishing;
    private int numberOfPages;
    private Author author;
    public Book(String title, int yearOfPublishing, int numberOfPages, Author author) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n")
                .append("Book Title: ").append(title).append("\n")
                .append("Year of publication of the Book: ").append(yearOfPublishing).append("\n")
                .append("Book count of pages: ").append(numberOfPages).append("\n")
                .append("Book Author: ").append(author.getName()).append("\n")
                .append("Book Author year of birth: ").append(author.getYearOfBirth()).append("\n");
        return sb.toString();
    }
}
