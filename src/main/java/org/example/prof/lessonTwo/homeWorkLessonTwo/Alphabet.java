package org.example.prof.lessonTwo.homeWorkLessonTwo;

public class Alphabet {
    private String name = "Alphabet";

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
       return name;
    }

    public void printAlphabet() {
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("The name alphabet is " + name);
        System.out.println("---------------------------");
    }
}
