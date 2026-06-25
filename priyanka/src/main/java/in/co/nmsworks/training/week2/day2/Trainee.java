package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private  int id;
    private String name;
    private static int counter =1;
    public Trainee(String name) {
        this.name = name;
        id=counter++;
    }



    @Override
    public String toString() {
        return "Trainee{"  + "Id: " + id +
                " name='" + name + '\'' +
                '}';
    }
}
