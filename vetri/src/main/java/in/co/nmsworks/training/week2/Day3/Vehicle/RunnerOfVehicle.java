package in.co.nmsworks.training.week2.Day3.Vehicle;

public class RunnerOfVehicle {
    public static void main(String[] args) {
        Cars c1=new Cars();
        c1.setId(1);
        c1.setBrand("Hyundai");
        c1.setColor("Red");
        c1.setTyre(4);
        c1.setEngine(new Engine("Petrol",1500));

        Bike Unicon=new Bike("Honda","Red",2,"Petrol",1000);
        Unicon.getBrand();
        Unicon.getCc();
        Unicon.getColor();
        Unicon.getEngine();
        Unicon.getTyre();

        System.out.println(c1);
        System.out.println(Unicon);


    }
}
