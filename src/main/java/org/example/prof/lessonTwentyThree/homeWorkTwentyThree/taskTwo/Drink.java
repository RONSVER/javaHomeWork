package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskTwo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class Drink implements Identifiable {

    private int id;

    private String type;

    private String countryStyle;

    private int liters;

    @Override
    public int getIdentifiable() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return id == drink.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
