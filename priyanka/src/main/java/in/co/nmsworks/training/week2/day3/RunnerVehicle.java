package in.co.nmsworks.training.week2.day3;

public class RunnerVehicle {
    public static void main(String[] args) {
        Car volvo = new Car(4,"Volvo");
        volvo.setEngine(new Engine(99,"Petrol"));
        System.out.println(volvo);
        Car bmw = new Car(4,"BMW");
        bmw.setEngine(new Engine(99,"Disel"));
        System.out.println(bmw);
        Bike honda = new Bike(2,"Honda");
        honda.setEngine(new Engine(1200,"Electric"));
        System.out.println(honda);
        Bike pulsar = new Bike(2,"Pulsar");
        pulsar.setEngine(new Engine(990,"Petrol"));
        System.out.println(pulsar);
    }
}
