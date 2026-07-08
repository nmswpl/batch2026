package in.co.nmsworks.week2.day4;

public class SchoolBag extends Container {

    private String brandName;
    private TextBook textBook = new TextBook();

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public TextBook getTextBook() {
        return textBook;
    }

    public void setTextBook(TextBook textBook) {
        this.textBook = textBook;
    }

    public void study() {
        textBook.read();
    }
}