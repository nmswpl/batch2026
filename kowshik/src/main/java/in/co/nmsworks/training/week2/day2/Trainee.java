package in.co.nmsworks.training.week2.day2;

public class Trainee {

    private static int counter = 1;

    private int id;
    private String name;

    public Trainee(String name) {
        this.name = name;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
