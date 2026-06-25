package in.co.nmsworks.training.week2.day3.shape;

public class Triangle {
    private double height;
    private double base;
    private double hyp;

    public Triangle(double height, double base, double hyp) {
        this.height = height;
        this.base = base;
        this.hyp = hyp;
    }

    public void findPerimeter(){
        System.out.println("perimeter of triangle: " + (height + base + hyp));
    }

    public void findArea(){
        System.out.println("area of triangle: " + (0.5 * base * height));
    }
}
