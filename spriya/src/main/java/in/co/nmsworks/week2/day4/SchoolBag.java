package in.co.nmsworks.week2.day4;

public class SchoolBag extends Container{
    String brandName;
    TextBook textBook=new TextBook();


    public  void study(){
        textBook.read();
    }
}
