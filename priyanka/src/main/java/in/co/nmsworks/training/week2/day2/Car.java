package in.co.nmsworks.training.week2.day2;

public class Car {
    private  int carNo;
    private String brand;
    private static int counter=1;

    public Car(String brand) {
        this.brand = brand;
        carNo=counter++;
    }



}
