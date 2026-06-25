package in.co.nmsworks.training.week2.day3;

public class Triangle extends Shape{

    @Override
    public void printArea() {
        this.length = 3;
        this.width = 2;
        double area=0.5*(length*width);
        System.out.println("Triangle :"+area);

    }

    public void printPerimeter(){
        int perimeter;
        this.length = 2;
        this.width = 4;
        int base = 5;
        perimeter = width+length+base;
        System.out.println("Triangle : "+ perimeter);
    }
}
