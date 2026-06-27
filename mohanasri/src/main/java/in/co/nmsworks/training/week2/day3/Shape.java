package in.co.nmsworks.training.week2.day3;

class Shape {
    public void printArea() {
        System.out.println("Area: 0.0");
    }

    public void printPerimeter() {
        System.out.println("Perimeter: 0.0");
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void printArea() {
        double area = side * side;
        System.out.println("Square Area: " + area);
    }

    @Override
    public void printPerimeter() {
        double perimeter = 4 * side;
        System.out.println("Square Perimeter: " + perimeter);
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = width * height;
        System.out.println("Rectangle Area: " + area);
    }

    @Override
    public void printPerimeter() {
        double perimeter = 2 * (width + height);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double side3;

    public Triangle(double base, double height, double side3) {
        this.base = base;
        this.height = height;
        this.side3 = side3;
    }

    @Override
    public void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }

    @Override
    public void printPerimeter() {
        double perimeter = base + height + side3;
        System.out.println("Triangle Perimeter: " + perimeter);
    }
}

