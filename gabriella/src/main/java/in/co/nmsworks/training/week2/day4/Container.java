package in.co.nmsworks.training.week2.day4;

public class Container {
    private double maxWeight = 50;

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void open(){
        System.out.println("Opening the bag...");
    }
}
