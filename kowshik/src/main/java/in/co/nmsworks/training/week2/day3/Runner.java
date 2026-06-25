package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;

public class Runner {
    public static void main(String[] args) {
        printShapes();

        createTraineesAndDisplay();

        createAndPrintVehicles();

        calculateAnnualSalary();

        printReport();
    }

    private static void printReport() {
        SalesReport sr = new SalesReport();
        System.out.println("Sales Report : " + sr.generateReport());

        InventoryReport ir = new InventoryReport();
        System.out.println("Inventory Report : " + ir.generateReport());
    }

    private static void calculateAnnualSalary() {
        Manager kowshik = new Manager();
        kowshik.setId(1);
        kowshik.setEmpName("Kowshik");
        kowshik.setSalaryPerMonth(30000);
        kowshik.setBonus(10000);

//        System.out.println("Total salary : " + kowshik.calculateAnnualSalary());
    }

    private static void createAndPrintVehicles() {
        Engine fourHundredCc = new Engine(1, 400, "Petrol");

        Bike himalayan = new Bike(1, "Himalayan", "Black", fourHundredCc);
        System.out.println("Bike 1 : " + himalayan);
        Bike dominor = new Bike(2, "Dominor", "Green", fourHundredCc);
        System.out.println("Bike 2 : " + dominor);

        Car polo = new Car(1, "Polo", "Blue", new Engine(2, 1000, "Petrol"));
        System.out.println("Car : " + polo);
        Car virtus = new Car(2, "Virtus", "Blue", new Engine(2, 1000, "Petrol"));
        System.out.println("Car : " + virtus);
    }

    private static void createTraineesAndDisplay() {
        Trainee t1 = new Trainee("Arun");
        Trainee t2 = new Trainee("Balaji");
        Trainee t3 = new Trainee("Das");
        Trainee t4 = new Trainee("Gopi");
        Trainee t5 = new Trainee("Hari");

        Trainee[] trainees = {t1, t2, t3, t4, t5};

        for (Trainee trainee : trainees) {
            System.out.println(trainee.getName());
        }
    }

    private static void printShapes() {
        Square square = new Square(2);
        square.printArea();
        square.printPerimeter();

        Rectangle rectangle = new Rectangle(2,3);
        rectangle.printArea();
        rectangle.printPerimeter();

        Triangle triangle = new Triangle(2,3,4);
        triangle.printArea();
        triangle.printPerimeter();
    }
}
