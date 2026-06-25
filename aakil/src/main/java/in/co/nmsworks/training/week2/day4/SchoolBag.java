package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{
    private String brandName;
    private Textbook textbook;

    public SchoolBag(double maxWeight, String brandName) {
        super(maxWeight);
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void study(){
        getTextbook().read();
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }
}
