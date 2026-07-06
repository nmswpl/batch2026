package in.co.nmsworks.training.week2.day4.smartremote;

public class Battery {

    private String brandName;
    private  int powerLevel;

    public Battery(String brandName, int powerLevel) {
        this.brandName = brandName;
        this.powerLevel = powerLevel;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }


}
