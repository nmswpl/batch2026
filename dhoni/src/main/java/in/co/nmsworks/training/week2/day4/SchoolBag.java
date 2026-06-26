package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{
    private String brandName;
    private TextBook textBook;

    public SchoolBag(double maxWeight, String brandName, TextBook textBook) {
        super(maxWeight);
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


    public void study(){
        System.out.println("Study method:");
        textBook.read();
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "brandName='" + brandName + '\'' +
                ", textBook=" + textBook +
                '}';
    }
}
