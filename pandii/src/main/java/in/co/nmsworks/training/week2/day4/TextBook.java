package in.co.nmsworks.training.week2.day4;

public class TextBook {
    String subject;

    public TextBook(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void read()
    {
        System.out.println("Reading a lines from textBook");
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
