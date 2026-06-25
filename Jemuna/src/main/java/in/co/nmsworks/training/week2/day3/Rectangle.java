package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape{
    public void printArea(){
        int area;
        this.length = 2;
        this.width = 6;
        area = length*width;
        System.out.println("Rectangle: "+area);
    }

    public void printPerimeter(){
        int perimeter;
        this.length = 2;
        this.width = 4;
        perimeter = 2*(width+length);
        System.out.println("Rectangle : "+ perimeter);
    }
}

