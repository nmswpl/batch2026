package in.co.nmsworks.training.week2.Day4.Inheritance;

public class SchoolBag extends Container{
    private String brandName;
    private Textbook textbook;

    public SchoolBag(String brandName, String book) {
        this.brandName = brandName;
        setTextbook(new Textbook(book));
    }

    public void study(){

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
}
