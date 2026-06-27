package in.co.nmsworks.training.week2.day3;

public class Runner {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        shape.printArea();
//        shape.printPerimeter();
//
//        Square square = new Square(4);
//        square.printArea();
//        square.printPerimeter();
//
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.printArea();
        rectangle.printPerimeter();

        Triangle triangle = new Triangle(2,3,10);
        triangle.printArea();
        triangle.printPerimeter();


        Bike bike1 = new Bike(1,"Activa",new Engine(25,"Petrol"),"pink","Scooty");
        Bike bike2 = new Bike(2,"Yamaha",new Engine(30,"Petrol"),"Black","Bike");

        Car car1 = new Car(1,"Maruthi",new Engine(40,"Diesel"), 8);
        Car car2 = new Car(2,"Tata",new Engine(50,"Electric"), 5);

        System.out.println(bike1);
        System.out.println(bike2);
        System.out.println(car1);
        System.out.println(car2);




    }
}
