package in.co.nmsworks.training.week2.day4;

public class Container {
    private double maxWeight;

    public Container(double maxWeight) {
        this.maxWeight = maxWeight;
    }

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
