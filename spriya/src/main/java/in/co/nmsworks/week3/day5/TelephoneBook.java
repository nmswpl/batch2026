package in.co.nmsworks.week3.day5;

public class TelephoneBook {

    private String name;
    private String mobileNumber;
    private String emailId;

    public TelephoneBook(String name, String mobileNumber, String emailId) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}