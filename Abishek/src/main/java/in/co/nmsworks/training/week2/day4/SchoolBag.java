package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{
    private String brandName;

    TextBook tb = new TextBook();
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public void study(){
        tb.read();
    }

}
