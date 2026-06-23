package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private static int counter=0;
    private  int id = ++counter;
    private String name;

    public Trainee(String name) {
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
