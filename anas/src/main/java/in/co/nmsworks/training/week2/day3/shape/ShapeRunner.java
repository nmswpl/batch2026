package in.co.nmsworks.training.week2.day3.shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Square sq = new Square(5);
        sq.findPerimeter();
        sq.findArea();

        Rectangle rc = new Rectangle(4,5);
        rc.findPerimeter();
        rc.findArea();

        Triangle t = new Triangle(2,5,6);
        t.findPerimeter();
        t.findArea();

    }
}
