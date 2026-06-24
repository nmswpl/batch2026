package in.co.nmsworks.training.week1.exam;

class Phone{
    private int id;
    private String brand;
    private String model;
    private float price;

    public Phone(){


    }

    public Phone(int id, String brand, String model, float Price){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = Price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void display(){
        System.out.println("ID = " + this.id);
        System.out.println("Brand = " + this.brand);
        System.out.println("Model = " + this.model);
        System.out.println("Price = " + this.price);
    }

}