package in.co.nmsworks.training.week2.day4.java;

public class SchoolBag extends Container {
    private String brandName = "Skybags";

    TextBook textBook = new TextBook();

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public TextBook getTextBook() {
        return textBook;
    }

    public void setT(TextBook textBook) {
        this.textBook = textBook;
    }

    public void study(){
        textBook.read();
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "brandName='" + brandName + '\'' +
                ", subject=" + textBook.getSubject() +
                ", max weight="+ super.toString()+
                '}';
    }
}
