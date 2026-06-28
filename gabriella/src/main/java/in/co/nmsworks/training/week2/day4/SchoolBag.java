package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{
    private String brandName;
    private Textbook textbook;

    public SchoolBag(String brandName, String subject) {
        this.brandName = brandName;
        this.textbook = new Textbook(subject);
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

    public void study(){
        textbook.read();
    }
}
