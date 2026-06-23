package in.co.nmsworks.training.week1.exam;

import java.sql.Struct;

public class mobile {
    private int id;
    private String brand;
    private String model;
    private double price;

    public mobile(){

    }

    public mobile(int newid,String newbrand,String newmodel,double newprice){
        this.id=newid;
        this.brand=newbrand;
        this.model=newmodel;
        this.price=newprice;
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
}
