package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private int id ;
    private static int counter = 1;
    private String name;

    public Trainee(String name) {
        id = counter++;
        this.name = name;
    }

    public int getId() {
//        id++;
        return id;
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
                "id=" + id + ", " +
                "name='" + name + '\'' +
                '}';
    }

}
