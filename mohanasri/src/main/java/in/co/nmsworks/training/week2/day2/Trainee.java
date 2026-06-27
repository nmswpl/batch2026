package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private int traineeID;
    private String name;
    static int counter = 1;

    public Trainee(String name) {
        traineeID = counter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }
//    @Override
//    public String toString() {
//        return
//                "name='" + name + '\'' +
//                '}';
   }

//"Trainee{" +
//        "ID=" + traineeID +