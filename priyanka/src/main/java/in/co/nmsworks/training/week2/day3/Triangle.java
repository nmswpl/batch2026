package in.co.nmsworks.training.week2.day3;

public class Triangle extends Shape {
    private Integer hypotenuse = 2;
    private Integer base = 10;
    private Integer height = 20;

    public Triangle(Integer hypotenuse, Integer base, Integer height) {
        this.hypotenuse = hypotenuse;
        this.base = base;
        this.height = height;
    }

    @Override
    public void printArea() {
        System.out.println("The area of triangle is " + 0.5*base*height);
    }

    @Override
    public void printPerimeter() {
        System.out.println("The perimeter of triangle is " + (hypotenuse+base+height));
    }
}
