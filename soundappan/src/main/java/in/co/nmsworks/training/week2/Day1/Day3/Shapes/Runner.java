package in.co.nmsworks.training.week2.Day1.Day3.Shapes;

public class Runner {
    public static void main(String[] args) {

        Shape square = new Square(5.0);
        Shape rectangle = new Rectangle(10.0, 5.0);
        Shape triangle = new triangle(6.0, 8.0, 5.0, 7.0);

        square.area();
        square.perimeter();
        System.out.println();

        rectangle.area();
        rectangle.perimeter();

        System.out.println();

        triangle.area();
        triangle.perimeter();
    }
}
