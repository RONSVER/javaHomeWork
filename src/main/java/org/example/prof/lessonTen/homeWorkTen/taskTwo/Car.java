package org.example.prof.lessonTen.homeWorkTen.taskTwo;

import java.util.Objects;

public class Car {
    private String mark;
    private String color;
    private String vinCode;
    private String regNum;


    public Car(String mark, String color, String vinCode, String regNum) {
        this.mark = mark;
        this.color = color;
        this.vinCode = vinCode;
        this.regNum = regNum;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vinCode, car.vinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinCode);
    }
}
