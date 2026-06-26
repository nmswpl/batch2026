package in.co.nmsworks.training.week2.day3;

public class RunnerForShape {

    public static void main(String[] args) {

            Shapes triangle = new Triangle(2,3,4);
            System.out.println("The area of Traingle is "+triangle.printArea());
            System.out.println("The perimeter of triangle is "+triangle.printPerimeter());

            Shapes Square = new Square(4);
            System.out.println("The area of square is "+Square.printArea());
            System.out.println("The perimeter of squatre is "+Square.printPerimeter());

            Shapes Rectangle = new Reactangle(18,27);
            System.out.println("The area of square is "+Rectangle.printArea());
            System.out.println("The perimeter of squatre is "+Rectangle.printPerimeter());


        }
    }


