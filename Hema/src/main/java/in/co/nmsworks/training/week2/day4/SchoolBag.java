package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{

    private String brandName;

    Textbook textbook1 = new Textbook("Java Programming");

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void study()
    {
        textbook1.read();
    }

}
