package in.co.nmsworks.training.week2.day4;

public class Textbook {
    private String subject;
    void read(){
        System.out.println("read...");
    }

    public Textbook(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Textbook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
