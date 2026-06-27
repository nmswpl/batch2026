package in.co.nmsworks.training.week2.day2;

public class Trainee {

    private int id;
    private String name;
    private static int counter = 1;
    private DaysOfWeek joiningDay;


    public Trainee(int id,String name) {
        this.id=id;
        this.name = name;
        id = counter++;
    }

    public DaysOfWeek getJoiningDay() {
        return joiningDay;
    }

    public void setJoiningDay(DaysOfWeek joiningDay) {
        this.joiningDay = joiningDay;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
