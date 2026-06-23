package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private static int count = 0;
    private int id;
    private String name;
    private MonthsOfYear joiningMonth;

    public Trainee(String name) {
        count += 1;
        this.name = name;
        this.id = count;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public MonthsOfYear getJoiningMonth() {
        return joiningMonth;
    }

    public void setJoiningMonth(MonthsOfYear joiningMonth) {
        this.joiningMonth = joiningMonth;
    }
}
