package in.co.nmsworks.week2.day4;

public class RunnerCar {

    public static void main(String[] args) {
        SmartCar sm = new SmartCar();

        sm.setBrand("BMW");
        System.out.println("The brand is: " + sm.getBrand());

        sm.drive();
        sm.startCar();
    }
}