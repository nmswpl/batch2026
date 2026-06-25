package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container {
    protected String brandName;
    protected TextBook textBook;

    public SchoolBag() {
    }

    public SchoolBag(String brandName, TextBook textBook,Double maxWeight) {
        this.brandName = brandName;
        this.textBook = textBook;
        setMaxWeight(maxWeight);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void study() {
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
