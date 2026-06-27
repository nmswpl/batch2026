package in.co.nmsworks.training.week2.day4;

public class Textbook {
    String subject = "Java Programming";
    void read(){
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
