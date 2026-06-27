package in.co.nmsworks.training.week2.day3;



public class RunnerVehicle {
    public static void main(String[] args) {


        Car1 car = new Car1(4, new Vehicle.Engine("Diesel", 250));
        Car1 car2 = new Car1(4, new Vehicle.Engine("Petrol",230));
        Bike bike1 = new Bike("Pulsar",new Vehicle.Engine("Petrol",120));
        Bike bike2 = new Bike("Apache", new Vehicle.Engine("Diesel", 113));
        Cycle cycle1 = new Cycle();
        Cycle cycle2 = new Cycle();
        System.out.println(car);
        System.out.println(car2);
        System.out.println(bike1);
        System.out.println(bike2);
        System.out.println(cycle2);
        System.out.println(cycle1);

//        Employee emp = new Employee("Mohana", 20000);
//        System.out.println(emp);
//        Manager man = new Manager("Mohanaa",30000,3000);
//        double v = man.annualSalary();
//        System.out.println("Bonus : " + v);



    }


}
