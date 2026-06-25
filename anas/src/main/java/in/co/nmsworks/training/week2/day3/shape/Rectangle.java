package in.co.nmsworks.training.week2.day3.shape;

class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
       this.length = length;
       this.breadth = breadth;
    }

    @Override
    public void findPerimeter() {
        System.out.println("perimeter of rectangle: " + 2 * (length + breadth));
    }

    @Override
    public void findArea() {
        System.out.println("area of rectangle: " + (length * breadth));
    }
}
