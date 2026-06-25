package in.co.nmsworks.training.week2.day4.java;

public class Container {
    public double maxWeight=20;

    public void open(){
        System.out.println("Opening the container...");
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Container{" +
                "maxWeight=" + maxWeight +
                '}';
    }
}
