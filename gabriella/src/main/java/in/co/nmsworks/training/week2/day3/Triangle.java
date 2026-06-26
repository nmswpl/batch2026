package in.co.nmsworks.training.week2.day3;

public class Triangle extends Shape{
    private Float base;
    private Float height;

    public Triangle(Float base, Float height) {
        this.base = base;
        this.height = height;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public void printArea(){
        Float area = 0.5f * base * height;
        System.out.println("Area of triangle = " + area);
    }

    @Override
    public void printPerimeter(){
        float perimeter = 3*base;
        System.out.println("Perimeter of triangle is: " + perimeter);
    }
}
