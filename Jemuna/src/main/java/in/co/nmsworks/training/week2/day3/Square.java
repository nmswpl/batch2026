package in.co.nmsworks.training.week2.day3;

public class Square extends Shape{
    public void printArea(){
        super.printArea();
        int area;
        this.length = 2;
        area = length*length;
        System.out.println("Square: "+area);
    }

    public void printPerimeter(){
        super.printPerimeter();
        int perimeter;
        this.length = 2;
        perimeter = 4*length;
        System.out.println("Square : "+ perimeter);
    }
}
