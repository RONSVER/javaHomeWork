package org.example.prof.lessonTwo.homeWorkLessonTwo;

public class ExampleAlpha {

    public static void printAllInfo(Alphabet[] alphabetsArr) {
        for (Alphabet alphabets : alphabetsArr) {
            alphabets.printAlphabet();
        }
    }

    public static void main(String[] args) {

        Alphabet[] arrAlpha = new Alphabet[] {new AlphaEng(), new AlphaSpain(), new AlphaRus()};
        printAllInfo(arrAlpha);
    }

}
