package in.co.nmsworks.training.week2.day3.shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Square s = new Square(5);
        s.printArea();
        s.printPerimeter();

        Rectangle r = new Rectangle(4,2);
        r.printArea();
        r.printPerimeter();

        Triangle t = new Triangle(4,8, 5);
        t.printArea();
        t.printPerimeter();
    }
}
