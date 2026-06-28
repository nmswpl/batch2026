package in.co.nmsworks.training.week2.day4.java;

public class Battery{
    public String brand;
    public int power;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                '}';
    }
}
