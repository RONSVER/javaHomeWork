package org.example.prof.lessonNine.homeWorkNine.miniGame;

import java.util.Objects;

public class City {
    private String cityName;
    private int repeats = 1;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName, int repeats) {
        this.cityName = cityName;
        this.repeats = repeats;
    }


    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(cityName, city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }
}
