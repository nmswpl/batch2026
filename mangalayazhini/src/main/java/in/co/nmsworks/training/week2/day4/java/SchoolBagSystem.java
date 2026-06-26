package in.co.nmsworks.training.week2.day4.java;

public class SchoolBagSystem {
    public static void main(String[] args) {

        TextBook javaBook = new TextBook();
        javaBook.setSubject("Java Programming");
        javaBook.read();


        SchoolBag mySchoolBag = new SchoolBag();
        mySchoolBag.setBrandName("Safari");
        mySchoolBag.setMaxWeight(3.0);
        mySchoolBag.setBook(javaBook);


        mySchoolBag.study();
        mySchoolBag.open();


    }
}
