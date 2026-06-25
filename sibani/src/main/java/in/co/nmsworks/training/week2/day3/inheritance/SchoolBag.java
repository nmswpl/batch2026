package in.co.nmsworks.training.week2.day3.inheritance;

public class SchoolBag extends Container{
    private String brandName;
    TextBook book ;

    public SchoolBag(String brandName) {
        this.brandName = brandName;
    }

    public SchoolBag(String brandName, TextBook book) {
        this.brandName = brandName;
        this.book = book;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void study() {
        book.read();
    }
    @Override
    public String toString() {
        return "SchoolBag{" +
                "brandName='" + brandName + '\'' + super.toString() +
                '}';
    }
}
