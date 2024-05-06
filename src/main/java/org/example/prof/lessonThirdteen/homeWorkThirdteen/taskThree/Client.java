package org.example.prof.lessonThirdteen.homeWorkThirdteen.taskThree;

import java.util.List;

public class Client {
/*
    Есть класс клиент, со следующими полями: уникальный идентификатор, имя, возраст.
    Дополнительно, у клиента есть поле - список телефонов.
*/

    final private int id;
    final private String name;
    final private int age;
    private final List<PhoneHomeWorkStreams> listPhone;

    public Client(int id, String name, int age, List<PhoneHomeWorkStreams> listPhone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.listPhone = listPhone;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<PhoneHomeWorkStreams> getListPhone() {
        return listPhone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", listPhone=" + listPhone +
                '}';
    }
}
