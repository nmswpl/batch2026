package in.co.nmsworks.training.week2.day4.schoolbag;

public class TextBook {

    private String subject;

    public TextBook(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void read(){
        System.out.println("Reading lines of code from the textbook");
    }

}
