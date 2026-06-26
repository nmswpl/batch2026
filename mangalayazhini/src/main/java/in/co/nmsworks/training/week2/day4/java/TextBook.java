package in.co.nmsworks.training.week2.day4.java;

public class TextBook {

    private String subject ;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void read(){
        System.out.println("Reading " + subject + " book");
    }

}

