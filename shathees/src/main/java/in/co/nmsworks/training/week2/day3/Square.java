package in.co.nmsworks.training.week2.day3;

public class Square extends Shape{

    public void printArea() {
        Integer side = 5;
        Integer area = side * side;
        System.out.println("The Area Of Square is :"+area);
    }


    public void printPerimeter() {
        Integer side = 5;
        Integer perimeter = 4 * side;
        System.out.println("The Perimeter Of Square is :"+perimeter);
    }
}
