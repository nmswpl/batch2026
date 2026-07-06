package in.co.nmsworks.training.week2.day3;

public class Circle extends Shape{



    public void printArea(){
        super.printArea();
        Double radius = 3.0;
        Double area = 3.14 * radius * radius;
        System.out.println("The Area of Circle is :"+area);
    }


    public void printPerimeter() {
        super.printPerimeter();
        Double radius = 3.0;
        Double perimeter = 2 * 3.14 * radius;
        System.out.println("The Perimeter Of Circle is :"+perimeter);

    }
}
