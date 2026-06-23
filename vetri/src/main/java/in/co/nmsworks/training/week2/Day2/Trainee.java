package in.co.nmsworks.training.week2.Day2;

public class Trainee {
    private int id;
    private String name;
    private static int counter = 1;

    //
    public Trainee(String name) {
        id = counter++;
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
