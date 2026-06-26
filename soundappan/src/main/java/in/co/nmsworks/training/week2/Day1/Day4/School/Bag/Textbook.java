package in.co.nmsworks.training.week2.Day1.Day4.School.Bag;

public class Textbook {

        private String subject;

    @Override
    public String toString() {
        return "Textbook{" +
                "subject='" + subject + '\'' +
                '}';
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

    void read () {
            System.out.println("Reading lines od code from the textbook");
        }
    }



