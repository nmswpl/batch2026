package in.co.nmsworks.training.week2.day2;

import java.util.Objects;

public class Trainee {
    private int id;
    private static int counter = 1;
    private String name;

    public Trainee(String name) {
        this.name = name;
        id = counter++;
    }

    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
