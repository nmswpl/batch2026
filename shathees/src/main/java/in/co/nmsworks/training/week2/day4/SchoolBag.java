package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends  Container{
    private String brandName;

    Textbook tb;

    public SchoolBag(Textbook tb, String brandName,double max) {
        this.tb = tb;
        this.brandName = brandName;
        setMaxWeight(max);
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setTb(Textbook tb) {
        this.tb = tb;
    }

    public String getBrandName() {
        return brandName;
    }

    public Textbook getTb() {
        return tb;
    }

    public void study(){
        tb.read();
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "brandName='" + brandName + '\'' +
                ", tb=" + tb +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
