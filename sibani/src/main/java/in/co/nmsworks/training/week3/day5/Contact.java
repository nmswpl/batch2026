package in.co.nmsworks.training.week3.day5;

public class Contact {
    private String name;
    private String number;
    private String emailId;

    public Contact() {
    }

    public Contact(String name, String number, String emailId) {
        this.name = name;
        this.number = number;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "TelephoneBook{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
