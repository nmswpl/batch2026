package in.co.nmsworks.training.week1.exam;

class MobilePhone {

    private int phoneId;
    private String brand;
    private String model;
    private double price;

    MobilePhone(){

    }

    MobilePhone(int phoneId, String brand, String model, double price) {
        this.phoneId = phoneId;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("ID = " + phoneId);
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
        System.out.println();
    }
}
