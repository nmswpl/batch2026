package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape{

    public void printArea(){
        super.printArea();
        Integer length = 5,breadth = 10;
        Integer area = (length * breadth);
        System.out.println("The Area Of Reactangle is :" + area);
    }

    public void printPerimeter(){
        super.printPerimeter();
        Integer length = 5,breadth = 10;
        Integer perimeter = (2 * (length + breadth));
        System.out.println("The Perimeter Of Rectangle is :" + perimeter);
    }
}
