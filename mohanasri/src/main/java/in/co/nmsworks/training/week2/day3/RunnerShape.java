package in.co.nmsworks.training.week2.day3;
import java.awt.*;
public class RunnerShape {

        public static void main(String[] args) {

            Shape s = new Square(5.0);
            Shape r = new Rectangle(4.0, 6.0);
            Shape t = new Triangle(3.0, 4.0, 5.0);

            s.printArea();
            r.printArea();
            t.printArea();
            s.printPerimeter();
            r.printPerimeter();
            t.printPerimeter();
        }
    }




