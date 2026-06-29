package in.co.nmsworks.training.week2.day3.inheritance;

public class Square extends Shape{
     Integer a = 5;
    @Override
    void printArea() {
        System.out.println("Area of Square is : " + (a*a));
    }

    @Override
    public void printPerimeter() {
        super.printPerimeter();
        System.out.println("Perimeter of Square is " + (4 * a));

    }


}
