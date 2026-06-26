package in.co.nmsworks.week2.day4;

public class TextBook {
    String subject;

    public void read(){
        System.out.println("Reading lines of code from the textbook.");

    }


    @Override
    public String toString() {
        return "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
