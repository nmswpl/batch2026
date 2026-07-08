package in.co.nmsworks.training.week1.exam;

// Mobile Class
class MobilePhone{
    private int id ;
    private String brand ;
    private String model ;
    private double price ;

    MobilePhone(int id, String brand, String model, double price){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

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

    public void mobilePhoneFeatures() {
        System.out.println("\nMobile Phone Features : ");
        System.out.println("ID" + " = " + id);
        System.out.println("Brand" + " = " + brand);
        System.out.println("Model" + " = " + model);
        System.out.println("Price" + " = " + price);
    }
}
