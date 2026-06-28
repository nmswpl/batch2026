package in.co.nmsworks.training.week1.Exam;

public class SecondQuestion {
    private int id;
    private String brand;
    private String model;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    SecondQuestion(int id, String brand, String model, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("ID :" + id);
        System.out.println("Brand :" + brand);
        System.out.println("Model :" + model);
        System.out.println("Price :" + price);
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        SecondQuestion m1 = new SecondQuestion(201, "Samsung", "Galaxy S24", 59000);
        m1.display();
        SecondQuestion m2 = new SecondQuestion(202, "Apple", "Iphone 11", 40000);
        m2.display();
        SecondQuestion m3 = new SecondQuestion(203, "Apple", "Iphone 12", 80000);
        m3.display();
        SecondQuestion m4 = new SecondQuestion(204, "Vivo", "V7", 50000);
        m4.display();
        SecondQuestion m5 = new SecondQuestion(205, "Jio", "Phone 2", 2500);
        m5.display();
    }

}
