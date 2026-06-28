package in.co.nmsworks.training.week2.day3.vehicle;

public class Runner {
    public static void main(String[] args) {
        Car thar = new Car("black", 4);
        thar.getEngine().setFuelType("petrol");
        thar.getEngine().setCc(1000);
        System.out.println(thar);

        Car bmw = new Car("black", 4);
        bmw.getEngine().setFuelType("petrol");
        bmw.getEngine().setCc(1500);
        System.out.println(bmw);

        Bike tvs = new Bike("blue",2);
        tvs.getEngine().setFuelType("petrol");
        tvs.getEngine().setCc(100);
        System.out.println(tvs);

    }
}
