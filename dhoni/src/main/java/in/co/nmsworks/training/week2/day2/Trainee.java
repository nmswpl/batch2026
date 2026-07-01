package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private static int counter = 1;
    private int id;
    private String name;

    public Trainee(String name) {
        this.name = name;
        this.id = counter++;
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
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
