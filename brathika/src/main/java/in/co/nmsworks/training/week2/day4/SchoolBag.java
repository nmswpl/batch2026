package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{
    private String brand;
    TextBook textbook;

    public void study(){
        textbook.read();
    }

    public String getBrand() {
        return brand;
    }

    public SchoolBag(String brand, TextBook textbook) {
        this.brand = brand;
        this.textbook = textbook;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public TextBook getTextbook() {
        return textbook;
    }

    public void setTextbook(TextBook textbook) {
        this.textbook = textbook;
    }


}
