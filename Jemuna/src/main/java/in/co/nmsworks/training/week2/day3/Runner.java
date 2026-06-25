package in.co.nmsworks.training.week2.day3;

public class Runner {
    public static void main(String[] args) {

        //trainee();
        vehicle();
        //employee();
        //report();
    }

    private static void report() {
        SalesReport sr = new SalesReport();
        System.out.println(sr.generate());

        InventoryReport ir = new InventoryReport();
        System.out.println(ir.generate());
    }

    private static void employee() {

        Employee emp = new Employee("Jemuna", 30000.00);
        System.out.println(emp);
        System.out.println("The annual salary of the Employee: "+emp.annualSalary());

        Manager mng = new Manager("SK", 300000,20);
        System.out.println(mng);
        System.out.println("The annual salary of the Employee: "+mng.annualSalary());


    }

    private static void vehicle() {

        Bike ather = new Bike("Ather");
        ather.setNoOfWheels(2);
        Engine engine = new Engine("Petrol", 1);
        System.out.println(ather);


        Ccar bolero = new Ccar( );
        bolero.setManufacturer("Maruthi Suzuki");
        bolero.setNoOfWheels(2);
        Engine engine1 = new Engine("Diesel", 2);
        System.out.println(bolero);



        Cycle ladybird= new Cycle("Pink");
        ladybird.setNoOfWheels(2);
        System.out.println(ladybird);
    }


    private static void trainee() {

        String[] name={"Arun","Balaji","Das","Gopi","Hari"};
        Trainee[] trainees= new Trainee[5];

        for (int i = 0; i < trainees.length; i++) {
            trainees[i] = new Trainee((i+1),name[i]);

        }

        System.out.println("List of Trainee");
        for (Trainee trainee : trainees) {
            System.out.println(trainee.getName());

        }
    }
}
