package in.co.nmsworks.training.week2.day3;

public class Runner {
    public static void main(String[] args) {
//        Square square = new Square(5);
//        Rectangle rectangle = new Rectangle(5,10);
//        Triangle triangle = new Triangle(10,15,10,10,10);
//
//        square.printArea();
//        square.printPerimeter();
//
//        rectangle.printArea();
//        rectangle.printPerimeter();
//
//        triangle.printArea();
//        triangle.printPerimeter();

        //arun , balaji, das, gopi, hari

        //arrayOfObjects();
        //typeOfVehicle();

//        String[] name = {"dhoni","karthi"};
//        Employee emp = new Employee(name[0],15000);
//        Manager manager = new Manager(name[1],15000);
//
//        System.out.println(emp +" " +emp.annualSalary());
//        System.out.println(manager +" " +manager.annualSalary());

         String sales = "sales";
         SalesReport s = new SalesReport(sales);
         String inventory = "inventory";
         InventoryReport in = new InventoryReport(inventory);

         s.salesReport();
         in.inventoryReport();

    }

    private static void typeOfVehicle() {
        String c1 = "BMW";
        Car bmw = new Car(true, new Engine(250, FuelType.DIESEL),c1,4);
        String c2 = "Toyoto";
        Car toyoto = new Car(true, new Engine(250, FuelType.DIESEL),c2,4);

        String color = "red";
        Bike rc = new Bike(true,new Engine(150, FuelType.PETROL),color,2);
        String color2 = "black";
        Bike ather = new Bike(true,new Engine(150, FuelType.ELECTRIC),color2,2);

        System.out.println(bmw);
        System.out.println(toyoto);
        System.out.println(rc);
        System.out.println(ather);

        System.out.println(bmw.getEngine());
        System.out.println(toyoto.getEngine());
        System.out.println(rc.getEngine());
    }

    private static void arrayOfObjects() {
        Trainee[] trainees = new Trainee[5];

        String[] names = {"arun","balaji","das","gopi","hari"};

        for (int i = 0; i < 5; i++) {
            trainees[i] = new Trainee(i+1, names[i]);
        }

        for(Trainee t : trainees){
            System.out.println(t.getName());
        }
    }



}
