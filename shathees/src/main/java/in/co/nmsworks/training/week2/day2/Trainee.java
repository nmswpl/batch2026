package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private int id;
    private String name;
    static  int count =0;
    public Trainee(String name) {
        count ++;
        this.name = name;
        this.id = count;
    }



    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                '}';
    }
}
