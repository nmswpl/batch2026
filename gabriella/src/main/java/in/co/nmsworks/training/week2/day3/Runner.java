package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;

public class Runner {
    public static void main(String[] args) {
        /* Triangle triangle = new Triangle(4.0f, 3.0f);
        Square square = new Square(5.0f);
        Rectangle rectangle = new Rectangle(3.0f, 4.0f);

        triangle.printPerimeter();
        triangle.printArea();

        square.printPerimeter();
        square.printArea();

        rectangle.printPerimeter();
        rectangle.printArea();

        String[] names = {"Arun", "Balaji", "Das", "Gopi", "Hari"};

        Trainee[] trainees = new Trainee[5];
        for (int i = 0; i < trainees.length; i++) {
            trainees[i] = new Trainee(names[i]);
            System.out.println(trainees[i]);

        }

        for (Trainee trainee : trainees) {
            trainee.printName();

        }

        Car car1 = new Car(1, "Car1", new Engine(1500, "Diesel"), "Model1", "Red");
        Car car2 = new Car(2, "Car2", new Engine(1500, "Petrol"), "Model2", "Black");

        Bike bike1 = new Bike(3,"Bike1", new Engine(1200, "Diesel"), "Model2");

        Cycle cycle1 = new Cycle(4, "Cycle1", "Teal");

        System.out.println(car1);
        System.out.println(bike1);
        System.out.println(cycle1);

        System.out.println(" ");

         */
        CompanyEmployee emp1 = new CompanyEmployee("Gaby", 30000);
        Manager m1 = new Manager("Some name", 200000, 100000);

        System.out.println(emp1);
        System.out.println(m1);

        System.out.println("Annual salary of employee: " + emp1.annualSalary());
        System.out.println("Annual salary of manager: " + m1.annualSalary());

        Report report = new Report();
        SalesReport salesReport = new SalesReport();
        InventoryReport inventoryReport = new InventoryReport();

        System.out.println("");
        System.out.println(salesReport.generate());
        System.out.println("");
        System.out.println(inventoryReport.generate());

    }
}
