package in.co.nmsworks.training.week2.day3;

public class RunnerVehicle {
    public static void main(String[] args) {
        Cars volvo = new Cars(4,"Volvo");
        volvo.setE(new Engine(99,"Petrol"));
        System.out.println(volvo);
        Cars bmw = new Cars(4,"BMW");
        bmw.setE(new Engine(99,"Disel"));
        System.out.println(bmw);
        Bike honda = new Bike(2,"Honda");
        honda.setE(new Engine(1200,"Electric"));
        System.out.println(honda);
        Bike pulsar = new Bike(2,"Pulsar");
        pulsar.setE(new Engine(990,"petrol"));
        System.out.println(pulsar);
    }
}
