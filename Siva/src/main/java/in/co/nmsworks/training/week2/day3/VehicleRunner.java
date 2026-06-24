package in.co.nmsworks.training.week2.day3;

public class VehicleRunner {

    public static void main(String[] args) {
        Bike b1 = new Bike("Black","Duke 250",2,FuelType.PETROL,250);
        Bike b2 = new Bike("Orange","Duke 200",2,FuelType.PETROL,200);
        System.out.println(b1);
        System.out.println(b2);
        Car c1 = new Car("White","Swift",4,FuelType.DIESEL,1200);
        Car c2 = new Car("White","Swift",4,FuelType.EV,1500);
        System.out.println(c1);
        System.out.println(c2);
        Bicycle bicycle = new Bicycle("White","Herculus",2);
        System.out.println(bicycle);
    }



}
