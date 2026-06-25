package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{
    public Textbook book;
    public String brandName;
    public void study(){
        book.read();
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "book=" + book +
                ", brandName='" + brandName + '\'' +
                ", maxWeight=" + maxWeight +
                '}';
    }


    public Textbook getBook() {
        return book;
    }

    public void setBook(Textbook book) {
        this.book = book;
    }

    public SchoolBag(double maxWeight, String brandName) {
        super(maxWeight);
        this.brandName = brandName;
    }
}
