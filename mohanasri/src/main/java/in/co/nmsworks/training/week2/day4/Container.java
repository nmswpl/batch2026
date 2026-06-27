package in.co.nmsworks.training.week2.day4;

public class Container {
    double maxWeight;
    void open(){
        System.out.println("Opening the container");
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
