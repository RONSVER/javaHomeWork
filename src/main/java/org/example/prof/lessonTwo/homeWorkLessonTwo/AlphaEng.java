package org.example.prof.lessonTwo.homeWorkLessonTwo;

public class AlphaEng extends Alphabet {
    private char[] alphaEngArr = new char[26];


    public AlphaEng() {
        setName("English");
        alphaEngArr = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                  'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println("");
        System.out.println("Letters: ");
        for (char letters : alphaEngArr) {
            System.out.println("letter " + letters + ", |");
        }

    }


}
