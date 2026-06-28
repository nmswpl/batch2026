package in.co.nmsworks.training.week2.day3.shape;

public class Triangle extends Shape {
    private Integer base;
    private Integer height;
    private Integer hypo;

    public Triangle(Integer base, Integer height, Integer hypo) {
        this.base = base;
        this.height = height;
        this.hypo = hypo;
    }


    public void printArea(){
        int triangleArea = (base * height)/2;
        System.out.println("Area of Triangle : "+triangleArea);
    }
    public void printPerimeter(){

        int perimeterTri = height + base + hypo;
        System.out.println("Perimeter of Triangle : "+ perimeterTri);
    }

}
