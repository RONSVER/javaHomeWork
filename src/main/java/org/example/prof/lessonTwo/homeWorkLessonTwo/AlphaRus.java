package org.example.prof.lessonTwo.homeWorkLessonTwo;

public class AlphaRus extends Alphabet{
    private char[] alphaRusArr;

    public AlphaRus() {
        setName("Russian");
        alphaRusArr = new char[] {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                                  'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
                                  'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',
                                  'ы', 'ь', 'э', 'ю', 'я'};
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println("");
        System.out.println("Letters: ");
        for (char letters : alphaRusArr) {
            System.out.println("letter " + letters + ", |");
        }

    }
}
