package org.example.prof.lessonThirdteen.homeWorkThirdteen.taskFour;

public class Auto {
//    номер авто, цвет, марка, пробег и цена (цена в диапазоне от 10 до 50 тысяч)

    final private String numberAuto;
    private String color;
    private String mark;
    private int mileage;
    final private int price;

    public Auto(String numberAuto, String color, String mark, int mileage, int price) {
        this.numberAuto = numberAuto;
        this.color = color;
        this.mark = mark;
        this.mileage = mileage;
        this.price = price;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public String getColor() {
        return color;
    }

    public String getMark() {
        return mark;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "numberAuto='" + numberAuto + '\'' +
                ", color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
