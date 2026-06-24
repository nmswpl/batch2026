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
