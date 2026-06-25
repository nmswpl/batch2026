package in.co.nmsworks.week2.day4;

public class RunnerCar {
    public static void main(String[] args) {
        SmartCar sm=new SmartCar();
        System.out.println("The brand is:" + (sm.brand="BMW"));
        sm.drive();

    }
}
