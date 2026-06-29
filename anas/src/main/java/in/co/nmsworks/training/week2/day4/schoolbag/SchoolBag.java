package in.co.nmsworks.training.week2.day4.schoolbag;

public class SchoolBag extends Container{
    private String brandName;
    private Textbook t1;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }



    public Textbook getT1() {
        return t1;
    }

    public void setT1(Textbook t1) {
        this.t1 = t1;
    }

    public void study(){
        t1.read();
    }


}
