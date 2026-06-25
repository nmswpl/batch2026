package in.co.nmsworks.training.week2.day3.shape;

class Square extends Shape{
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public void findPerimeter(){
        System.out.println("perimeter of square: " + (2 * side));
    }

    public void findArea(){
        System.out.println("area of square: " + (side * side));
    }

}
