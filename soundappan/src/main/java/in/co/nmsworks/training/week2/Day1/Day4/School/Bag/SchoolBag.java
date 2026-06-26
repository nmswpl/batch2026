package in.co.nmsworks.training.week2.Day1.Day4.School.Bag;

public class SchoolBag extends Container {
    private String brandName;
    private Textbook textbook;

    @Override
    public String toString() {
        return "SchoolBag{" +
                "brandName='" + brandName + '\'' +
                ", textbook=" + textbook +
                '}';
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

    public SchoolBag(double maxWeight, String brandName, Textbook textbook) {
        super(maxWeight);
        this.brandName = brandName;
        this.textbook = textbook;
    }

    public void study(){
      System.out.println("Study");
      textbook.read();
    }
}
