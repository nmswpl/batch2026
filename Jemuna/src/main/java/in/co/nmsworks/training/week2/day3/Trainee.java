package in.co.nmsworks.training.week2.day3;

public class Trainee {
    private int id;
    private String name;

    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
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


