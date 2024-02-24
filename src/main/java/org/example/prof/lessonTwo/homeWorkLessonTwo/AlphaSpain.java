package org.example.prof.lessonTwo.homeWorkLessonTwo;

public class AlphaSpain extends Alphabet {
    private char[] alphaSpainArr;

    public AlphaSpain() {
        setName("Spain");
        alphaSpainArr = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                                    'á', 'é', 'í', 'ó', 'ú', 'ü', 'ñ'};
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println("");
        System.out.println("Letters: ");
        for (char letters : alphaSpainArr) {
            System.out.println("letter " + letters + ", |");
        }
        System.out.println();
    }


}
