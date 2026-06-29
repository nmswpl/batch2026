package in.co.nmsworks.training.week2.day3;

import java.util.Objects;

public class Trainee {
    private static int counter = 1;
    private int id;
    private String name;

    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Trainee.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trainee trainee = (Trainee) o;
        return id == trainee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
