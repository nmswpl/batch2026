package in.co.nmsworks.training.week2.day3.inheritance;

public class Container {
    private double maxWeight;
    void open() {
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
