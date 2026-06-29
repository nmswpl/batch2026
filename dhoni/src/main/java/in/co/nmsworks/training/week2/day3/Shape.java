package in.co.nmsworks.training.week2.day3;

public class Shape {

    public void printArea(){};
    public void printPerimeter(){};
}


class Square extends Shape{

    private float length;

    public Square(float length) {
        this.setLength(length);
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    @Override
    public void printArea() {
        System.out.println("Area square : " + this.getLength()*this.getLength() +" Sq meter" );
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter square : " + this.getLength()*4 +" meter" );
    }
}


class Rectangle extends Shape{

    private float width;
    private float length;

    public Rectangle(float length, float width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public void printArea() {
        System.out.println("Area rectangle : " + this.getLength()*this.getWidth() +" Sq meter" );
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter rectangle : " + (this.getLength()+this.getWidth())*2 +" meter" );
    }
}


class Triangle extends Shape{
    private float height;
    private float base;
    private float sideA;
    private float sideB;
    private float sideC;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    public Triangle(float height, float base, float sideA, float sideB, float sideC){
        this.setHeight(height);
        this.setBase(base);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    @Override
    public void printArea() {
        System.out.println("Area triangle : " + (this.getHeight()*this.getBase())/2 +" Sq meter" );
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter triangle : " + (this.getSideA() + this.getSideB() + this.getSideC()) +" meter" );
    }
}
