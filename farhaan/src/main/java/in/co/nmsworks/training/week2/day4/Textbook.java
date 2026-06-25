package in.co.nmsworks.training.week2.day4;

public class Textbook {
    public String subject;
    public void read(){
        System.out.println("Reading lines of code from the textbook");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Textbook(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Textbook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
