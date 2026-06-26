package in.co.nmsworks.training.week2.day3;

public class RunnerForInheritence {
    public static void main(String[] args) {
        Square s = new Square(5);
        s.printArea();
        s.printPerimeter();

        Rectangle r  = new Rectangle(10,20);
        r.printArea();
        r.printPerimeter();

        Triangle t  = new Triangle(1,2,3);
        t.printArea();
        t.printPerimeter();
    }
}
