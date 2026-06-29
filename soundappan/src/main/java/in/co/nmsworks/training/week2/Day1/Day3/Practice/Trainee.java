package in.co.nmsworks.training.week2.Day1.Day3.Practice;

public class Trainee {

    private int id = 1;
    private String name;

    public Trainee(int id,String name) {
        this.id = id;
        this.name = name;
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


    public static void main(String[] args) {


    }
}
