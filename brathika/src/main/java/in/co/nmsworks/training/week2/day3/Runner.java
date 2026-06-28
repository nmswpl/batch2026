package in.co.nmsworks.training.week2.day3;

import in.co.nmsworks.training.week2.day2.Trainee;
import in.co.nmsworks.training.week2.day4.SchoolBag;

public class Runner {
    public static void main(String[] args) {
       /* Triangle shape1 = new Triangle(2,4,6);
        shape1.area();
        shape1.perimeter();
        Square shape2 = new Square(5);
        shape2.area();
        shape2.perimeter();
        Reactangle shape3 = new Reactangle();
        shape3.area();
        shape3.perimeter();*/
        String[] names = {"Arun", "Balaji", "Das", "Gopi", "Hari"};
        Trainee[] trainees = new Trainee[names.length];
        for (int i = 0; i < names.length; i++) {
            trainees[i] = new Trainee(i + 1, names[i]);
        }
        for (Trainee trainee : trainees) {
            System.out.println(trainee.getName());
        }
        Engine bikeengine1 = new Engine("Petrol",350);
        Bike b1 = new Bike(2,"Red",bikeengine1 ,"Royal Enfield","Royal Enfield");
        System.out.println(b1);
        printManagerSalary();
        reportGeneration();
    }



    private static void reportGeneration() {
        SalesReport s1 = new SalesReport();

        System.out.println(s1.generate());
        InventoryReport r1 = new InventoryReport();
        System.out.println(r1.generate());
    }

    private static void printManagerSalary() {
        Manager m1 = new Manager("Arun",10000.0,10000.0);
        System.out.println(m1.annualSalary());
    }
}
