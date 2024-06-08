package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Book {

    private final int isbn;

    @EqualsAndHashCode.Exclude
    private final String title;

    @EqualsAndHashCode.Exclude
    private final int yearOfPublishing;

    @EqualsAndHashCode.Exclude
    private final int numberOfPages;

    @EqualsAndHashCode.Exclude
    private final Author author;

    @Override
    public String toString() {
        return "\n" +
                "Book Isbn: " + isbn + "\n" +
                "Book Title: " + title + "\n" +
                "Year of publication of the Book: " + yearOfPublishing + "\n" +
                "Book count of pages: " + numberOfPages + "\n" +
                "Book Author: " + author.getName() + "\n" +
                "Book Author year of birth: " + author.getYearOfBirth() + "\n";
    }
}
