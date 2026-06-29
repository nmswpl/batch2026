package in.co.nmsworks.training.week2.Day1.Day3.Shapes;

public class Shape {
    public void area() {
        System.out.println("Area");
    }

    public void perimeter() {
        System.out.println("Perimeter");
    }
}

class Square extends Shape {
    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    private Double side;

    public Square(Double side) {
        this.side = side;
    }


    public void area() {
        System.out.println("Area Of The Square : " + side * side);
    }

    public void perimeter() {
        System.out.println("Perimeter Of The Square : " + (4 * side));
    }

}

class Rectangle extends Shape {
    public Rectangle(Double len, Double bre) {
        this.len = len;
        this.bre = bre;
    }

    public Double getLen() {
        return len;
    }

    public void setLen(Double len) {
        this.len = len;
    }

    public Double getBre() {
        return bre;
    }

    public void setBre(Double bre) {
        this.bre = bre;
    }

    private Double len;
    private Double bre;

    public void area() {
        System.out.println("Area Of The Rectangle : " + (len * bre));

    }

   public void perimeter() {
        System.out.println("Perimeter Of The Rectangle : " + (2 * (len + bre)));

    }
}

class triangle extends Shape {
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getSide3() {
        return side3;
    }

    public void setSide3(Double side3) {
        this.side3 = side3;
    }

    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getHei() {
        return hei;
    }

    public void setHei(Double hei) {
        this.hei = hei;
    }

    public triangle(Double base, Double hei, Double side1, Double side3) {
        this.base = base;
        this.hei = hei;
        this.side1 = side1;
        this.side3 = side3;
    }

    private Double base;
    private Double hei;
    private Double side1;
    private Double side3;

    public void area() {
        System.out.println("Area of the Triangle : " + (0.5 * base * hei));
    }

   public void perimeter() {
        System.out.println("Perimeter Of the Triangle : " + (side1 + base + side3));
    }
}
