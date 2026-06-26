package in.co.nmsworks.training.week2.day3;

import javafx.scene.shape.Shape;

public class Shapes {


    public double printArea(){
      return 0.0;
    }
    public double printPerimeter(){
       return 0.0;
    }
}

class Triangle extends Shapes{

    double side1;
    double side2;
    double side3;

    public Triangle(double side1,double side2,double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double printArea() {
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*s*(s-side2)*s*(s-side3));

    }
    @Override
    public double printPerimeter(){
         return side1+side2+side3;
    }


}
class Square extends Shapes{
    double a;


    public Square(double a) {
        this.a = a;

    }

    @Override
    public double printArea() {
        double area = a*a;
        return area;
    }

    @Override
    public double printPerimeter() {
        double perimeter= 4*a;
        return perimeter;
    }
}

class Reactangle extends Shapes{
    double a;
    double b;

    public Reactangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double printArea() {
       double area= a*b;
       return area;
    }

    @Override
    public double printPerimeter() {
        double perimeter = 2*(a+b);
        return perimeter;
    }
}
