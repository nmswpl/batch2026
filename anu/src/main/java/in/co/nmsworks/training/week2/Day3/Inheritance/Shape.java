package in.co.nmsworks.training.week2.Day3.Inheritance;

public class Shape {
    protected int base;
    protected int height;
    protected int hypo;

    public void calculateArea() {
    }

    public void calculatePerimeter() {
    }
}


class Square extends Shape {
    public Square(int side) {
        this.base = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Square Area: " + base*base);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Square Perimeter: " + 4*base);
    }
}

class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        this.base = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle Area: " + base * height);

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Rectangle perimeter: " + 2*(base+height));
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height,int hypo) {
        this.base = base;
        this.height = height;
        this.hypo=hypo;
    }

    @Override
    public void calculateArea() {
        System.out.println("Triangle Area: " + base+height+hypo);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Triangle Volume: " + (base+height)/2);
    }
}
