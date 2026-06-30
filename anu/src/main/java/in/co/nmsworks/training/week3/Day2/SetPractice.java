package in.co.nmsworks.training.week3.Day2;

public class SetPractice {
    String fruits;


    public SetPractice(String fruits) {
        this.fruits = fruits;
    }

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "setPractice{" +
                "fruits='" + fruits + '\'' +
                '}';
    }
}
