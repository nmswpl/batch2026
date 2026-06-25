package in.co.nmsworks.training.week2.day2;

public class Trainee {
    private int id;
    private String name;
    static int counter = 0 ;

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



    public Trainee(String name){
        this.id = ++counter;
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
}
