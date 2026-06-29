package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private int id ;
    private  String name;
    private static int counter = 1;
    private DaysOfWeek joiningDay = DaysOfWeek.FRIDAY;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public Trainee(String name) {
        this.name = name;
        id = counter++;

    }



    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public DaysOfWeek getJoiningDay() {
        return joiningDay;
    }
}
