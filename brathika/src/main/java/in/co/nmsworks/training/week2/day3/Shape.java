package in.co.nmsworks.training.week2.day3;

public class Shape {
    public void area() {
    }

    public void perimeter() {

    }
}
class Triangle extends Shape {
    private Integer base;
    private Integer height;
    private Integer side;

    public Triangle(Integer side, Integer height, Integer base) {
        this.side = side;
        this.height = height;
        this.base = base;
    }

    @Override
    public void area() {
        Float area = (float) ((base * height) / 2);
        System.out.println("Area of Triangle is:"+area);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Triangle is: "+(2 * side + base ));
    }
}
class Square extends Shape {
    private Integer length = 4;

    public Square(Integer length) {
        this.length = length;
    }

    @Override
    public void area() {

        Float area = (float) length * length;
        System.out.println("Area of Square is: "+area);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Square is: "+(4 * length));
    }
}
class Reactangle extends Shape {
    private Integer length;
    private Integer breath;

    @Override
    public void area() {
        Float area = (float) length * breath;
        System.out.println("Area of Rectangle is: "+area);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: "+(2 * length + 2 * breath));
    }
}