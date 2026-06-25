package in.co.nmsworks.training.week2.Day4.Inheritance;

public class Textbook {
    String subject;

    public Textbook(String subject) {
        this.subject = subject;
    }

    public void read(){
        System.out.println("Reading lines of code from the textbook.");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
