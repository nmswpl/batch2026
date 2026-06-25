package in.co.nmsworks.training.week2.day3;

public class VehicleRunner {
    public static void main(String[] args) {
        Engine e1=new Engine("petrol",200);
        Bike pulsar=new Bike("latest","Black");
        Bike ktm=new Bike("duke","Orange");
        pulsar.setEngine(e1);
        System.out.println(pulsar);
//        Engine e1=new Engine("power",200);
//        System.out.println(pulsar.getModel()+" "+pulsar.getColor()+" "+pulsar.getEngine());
//        System.out.println(pulsar.getEngine());

    }
}
