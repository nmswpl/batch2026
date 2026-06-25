package in.co.nmsworks.training.week2.day4;

public class Container {
    protected Double maxWeight;

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    protected void open() {
        System.out.println("Opening the Container....");
    }
}
