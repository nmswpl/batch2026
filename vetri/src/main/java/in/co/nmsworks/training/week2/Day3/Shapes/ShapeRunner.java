package in.co.nmsworks.training.week2.Day3.Shapes;

public class ShapeRunner {
    public static void main(String[] args) {
        Square s1=new Square(5);
        s1.area();
        s1.perimeter();

        Rectangle r1=new Rectangle(4,7);
        r1.area();
        r1.perimeter();

        Triangle t1=new Triangle(1,2,3);
        t1.area();
        t1.perimeter();

    }
}
