package in.co.nmsworks.training.week2.Day1.Day4.School.Bag;

public class Container {
    public Container(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    private double maxWeight;

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    public void open(){
        System.out.println("Opening the Container");
    }
}
