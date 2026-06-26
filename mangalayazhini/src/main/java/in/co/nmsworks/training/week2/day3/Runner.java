package in.co.nmsworks.training.week2.day3;
import in.co.nmsworks.training.week2.day2.Trainee ;



public class Runner {
    public static void main(String[] args) {
        Square square = new Square();
        square.shape();
        square.setLength(5);
        square.printArea();
        square.printPerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.shape();
        rectangle.setBreadth(10);
        rectangle.setLength(5.5);
        rectangle.printArea();
        rectangle.printPerimeter();


        Triangle triangle = new Triangle();
        triangle.shape();
        triangle.setSide1(5);
        triangle.setSide2(6);
        triangle.setSide3(7);
        triangle.setHeight(10);
        triangle.printArea();
        triangle.printPerimeter();


        Trainee trainee1 = new Trainee("Arun");
        Trainee trainee2 = new Trainee("Balaji");
        Trainee trainee3 = new Trainee("Das");
        Trainee trainee4 = new Trainee("Gopi");
        Trainee trainee5 = new Trainee("Hari");

        Trainee[] traineeArray = new Trainee[5];

        traineeArray[0] = trainee1;
        traineeArray[1] = trainee2;
        traineeArray[2] = trainee3;
        traineeArray[3] = trainee4;
        traineeArray[4] = trainee5;

        System.out.println("Trainee :");
        for (int i = 0; i < traineeArray.length; i++) {
            System.out.println(traineeArray[i].getName());
        }

        Bike access = new Bike("Suzuki", "access", 85000,"petrol", 1500);
        Bike aprilla = new Bike("Suzuki", "aprilla sx", 130000,"petrol", 1200);

        Car maruthi = new Car("Maruti Suzuki","Swift", 500000, "desiel", 1000);
        Car city = new Car("Maharindra","Scorpio", 300000, "desiel", 1700);

        Bicycle cycle1 = new Bicycle("Company 1", "cycle1", 10000);

        System.out.println(access);
        System.out.println(aprilla);

        System.out.println(maruthi);
        System.out.println(city);

        System.out.println(cycle1);


        Employee emp1 = new Employee("Nithya", 30000.0);
        System.out.println(emp1);
        emp1.annualSalary();

        Manager emp2 = new Manager();
        emp2.setName("Aambal");
        emp2.setSalaryPerMonth(40000.0);

        emp2.setBonus(5000.0);
        System.out.println(emp2);
        emp2.annualSalary();

        SalesReport sale = new SalesReport();
        sale.generate();

        InventoryReport inventory = new InventoryReport();
        inventory.generate();


    }
}
