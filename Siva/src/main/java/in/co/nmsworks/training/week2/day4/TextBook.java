package in.co.nmsworks.training.week2.day4;

public class TextBook {
    protected String subject;

    public TextBook(String subject) {
        this.subject = subject;
    }

    public TextBook() {
    }

    protected void read() {
        System.out.println("Reading lines of code from the "+subject);
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
