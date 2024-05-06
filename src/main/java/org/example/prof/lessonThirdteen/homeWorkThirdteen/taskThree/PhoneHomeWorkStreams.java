package org.example.prof.lessonThirdteen.homeWorkThirdteen.taskThree;

public class PhoneHomeWorkStreams {
/*
    Класс телефона содержит само значение и тип (стационарный или мобильный).
*/

    final private String number;
    final private String type;
    public PhoneHomeWorkStreams(String number, String type) {
        this.number = number;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PhoneHomeWorkStreams{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
