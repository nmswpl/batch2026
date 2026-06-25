package in.co.nmsworks.training.week2.day4;

public class SchoolBag extends Container{

    public String brandName;
    public Textbook textbook;

    public SchoolBag(String brandName,double maxWeight,Textbook textbook) {
        this.brandName = brandName;
        this.maxWeight = maxWeight;
        this.textbook = textbook;
    }

    public void study(){
         textbook.read();
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "textbook=" + textbook +
                ", maxWeight=" + maxWeight +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
