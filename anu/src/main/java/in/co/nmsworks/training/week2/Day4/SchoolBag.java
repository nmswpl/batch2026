package in.co.nmsworks.training.week2.Day4;

public class SchoolBag extends Container{
    private String brandName;
    private Textbook textBook;


    public SchoolBag(String brandName, double maxWeight,Textbook textBook) {
        this.brandName = brandName;
        this.maxWeight=maxWeight;
        this.textBook = textBook;
    }

    public void study(){
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
