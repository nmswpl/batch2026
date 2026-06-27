package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{
    String brandName;
    Textbook textbook;

    public SchoolBag(String brandName, Textbook textbook) {
        this.brandName = brandName;
        this.textbook = textbook;
    }

    void study(){
        textbook.read();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "brandName='" + brandName + '\'' +
                ", textbook=" + textbook +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
