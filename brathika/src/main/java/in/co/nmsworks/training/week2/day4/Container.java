package in.co.nmsworks.training.week2.day4;

public class Container {
    private Double maxWeight;

    public Double getMaxWeight() {
        return maxWeight;
    }

    public Container() {
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Container(Double maxWeight) {
        this.maxWeight = maxWeight;
    }


    public void open() {
        System.out.println("Opening the container");
    }
}
