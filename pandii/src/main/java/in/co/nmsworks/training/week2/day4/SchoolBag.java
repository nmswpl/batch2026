package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{
    String brandName;
    TextBook textBook;

    public SchoolBag(String brandName, TextBook textBook) {
        this.brandName = brandName;
        this.textBook = textBook;
    }

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

    void study()
    {
        textBook.read();
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "brandName='" + brandName + '\'' +
                ", textBook=" + textBook +
                ", maxWeight=" + maxWeight +
                '}';
    }


}
