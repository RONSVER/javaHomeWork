package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskOne;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Author {

    private final String name;

    private final int yearOfBirth;

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}