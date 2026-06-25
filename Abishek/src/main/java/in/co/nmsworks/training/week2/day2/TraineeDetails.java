package in.co.nmsworks.training.week2.day2;

public class TraineeDetails {
    private int id ;
    private String name;
    private static int count=0;
    TraineeDetails(String name){
        count++;
        id = count;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TraineeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
