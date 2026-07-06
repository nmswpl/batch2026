package in.co.nmsworks.training.Week3.Map.Day6;



import java.util.Objects;

public class TelephoneBook {

    private String name;
    private Long number;
    private String emailId;

    public TelephoneBook() {
    }

    public TelephoneBook(String name, Long number, String emailId) {
        this.name = name;
        this.number = number;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public Long getNumber() {
        return number;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Long number) {
        this.number = number;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TelephoneBook)) return false;
        TelephoneBook that = (TelephoneBook) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(number, that.number) &&
                Objects.equals(emailId, that.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, emailId);
    }
}