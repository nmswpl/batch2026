package in.co.nmsworks.training.week2.Day4.Inheritance;

public class Container {
    private double maxWeight;

    public void open(){
        System.out.println("Opening the container...");
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
