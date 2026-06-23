package in.co.nmsworks.training.week1.exam;

public class MobilePhone {

    private int id;
    private String brand;
    private String model;
    private double price;
    public  MobilePhone(){
        //default constuctor
    }

    public  MobilePhone(int id, String brand, String model, double price){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public void mobliePhoneDetails(MobilePhone phone){
//        System.out.println("ID: " +phone.getId());
//        System.out.println("BRAND: " + phone.getBrand());
//        System.out.println("MODEL: " + phone.getModel());
//        System.out.println("PRICE: " + phone.getPrice());
//    }


    public void mobliePhoneDetails(){
        System.out.println("ID: " +this.id);
        System.out.println("BRAND: " + this.brand);
        System.out.println("MODEL: " + this.model);
        System.out.println("PRICE: " + this.price);
    }
}
