package in.co.nmsworks.training.week2.day4.schoolbag;

public class Textbook {
    private String subject;

    public Textbook(String subject) {
        this.subject = subject;
    }

    public void read(){
        System.out.println(subject);
    }
}
