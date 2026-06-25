package in.co.nmsworks.training.week2.day3.inheritance;

import in.co.nmsworks.training.week2.day2.Trainee;

public class Runner {
    public static void main(String[] args) {
        /*Square s = new Square();
        s.printArea();
        s.printPerimeter();
        Rectangle r = new Rectangle();
        r.printPerimeter();
        r.printArea();
        Triangle t = new Triangle();
        t.aboutTriangle();
        t.printArea();
        t.printPerimeter();


        String[] names = {"Arun", "Balaji", "Das", "Gopi", "Hari"};
        Trainee[] trainees = new Trainee[names.length];

        for(int i=0; i< trainees.length; i++) {
             trainees[i] = new Trainee(names[i]);
        }
        for (Trainee trainee : trainees) {
            System.out.println(trainee.getName());
        }


        Bike pulsar = new Bike("Black",2);
        pulsar.setEnginee(new Enginee(150,"Petrol"));
        System.out.println(pulsar);
        Car swift = new Car("White", 4);
        swift.setEnginee(new Enginee(250, "Diesel"));
        System.out.println(swift);


        Manager ram = new Manager(25000.00);
        ram.setSalary(50000.00);
        ram.setName("Ram Kumar");
        System.out.println(ram);
        System.out.println(ram.annualSalary());


        SalesReport sr = new SalesReport();
        sr.generate();
        InventoryReport ir = new InventoryReport();
        ir.generate();

        SchoolBag bag = new SchoolBag("Roshan",new TextBook("Java Programming"));
        bag.setMaxWeight(20.00);
        bag.open();
        bag.study();
        System.out.println(bag); */

        DigitalWallet wallet = new DigitalWallet(new Coin(500));
        wallet.setColor("Brown");
        wallet.carry();
        wallet.makePayment();

    }
}
