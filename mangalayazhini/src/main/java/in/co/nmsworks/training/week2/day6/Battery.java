package in.co.nmsworks.training.week2.day6;

public class Battery {
    private String brand;
    private int power;

    Battery(String brand, int power){
        this.brand = brand;
        this.power = power;
    }

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

    public void checkBatteryPower() {
        System.out.println("Battery Power: "+power);
    }
}
