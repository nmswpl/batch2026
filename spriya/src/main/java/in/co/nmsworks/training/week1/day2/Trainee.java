package in.co.nmsworks.training.week1.day2;

public class Trainee {

    private int id;

    private String name;

    public Trainee(){

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

    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
