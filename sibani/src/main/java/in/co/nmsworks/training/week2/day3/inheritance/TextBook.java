package in.co.nmsworks.training.week2.day3.inheritance;

public class TextBook {
    private String subject;
    void read() {
        System.out.println("Reading lines of code from the textbook.");
    }

    public TextBook(String subject) {
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
        return "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
