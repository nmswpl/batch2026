package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private int id;
    private String name;
    private static int counter = 1;


    public Trainee(String name) {
        this.name = name;
        this.id = counter++;
    }

    public void printName(){
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
