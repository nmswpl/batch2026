package in.co.nmsworks.training.week2.day3.vehicle;

public class VehicleRunner {
    public static void main(String[] args) {

        Engine e1 = new Engine(150,"petrol");
        Bike b1 = new Bike(e1,2,"black");

        System.out.println(b1);
    }
}
