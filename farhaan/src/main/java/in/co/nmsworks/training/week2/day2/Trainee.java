package in.co.nmsworks.training.week2.day2;

public class Trainee {
    public int id;
    public String name;
    public static int counter = 1;

    public Trainee(String name) {
        this.id = counter++;
        this.name = name;
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
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }

}
