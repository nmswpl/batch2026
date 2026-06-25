package in.co.nmsworks.training.week2.day4.java;

public class SchoolBag extends Container {
    public String brandName = "Skybags";

    TextBook t = new TextBook();

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public TextBook getT() {
        return t;
    }

    public void setT(TextBook t) {
        this.t = t;
    }

    public void study(){
        t.read();
    }

    @Override
    public String toString() {
        return "SchoolBag{" +
                "brandName='" + brandName + '\'' +
                ", subject=" + t.getSubject() +
                ", max weight="+ super.toString()+
                '}';
    }
}
