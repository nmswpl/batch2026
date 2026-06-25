package in.co.nmsworks.training.week2.day4.schoolbag;

public class Container {

    private Integer maxWeight;

    public Container(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }


    public  void  open(){
        System.out.println("Opening the Container");
    }


}
