package in.co.nmsworks.training.week2.Day4;

public class Textbook {
    protected String subject;

    public void read(){
        System.out.println("Reading lines of code from the textbook.");
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
