package in.co.nmsworks.week2.day3;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setFuelType("Petrol");
        engine.setCc(350);

        Bike bullet = new Bike();
        bullet.setId(1);
        bullet.setName("Royal Enfield");
        bullet.setColor("Red");
        bullet.setEngine(engine);

        System.out.println(bullet);

        System.out.println();

        Engine carEngine = new Engine();
        carEngine.setFuelType("Diesel");
        carEngine.setCc(1500);

        Car car = new Car();
        car.setId(2);
        car.setName("Creta");
        car.setManufacturer("Hyundai");
        car.setEngine(carEngine);

        System.out.println(car);

        System.out.println();

        Cycle cycle = new Cycle();
        cycle.setId(3);
        cycle.setName("Hero");
        cycle.setType("Gear");

        System.out.println(cycle);
    }
}