package in.co.nmsworks.training.week3.day5;

public class ContactDetails {
    private String name;
    private String mobileNumber;
    private String emailId;

    public ContactDetails(String name, String mobileNumber, String emailId) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return  " name : " + name +
                " mobileNumber : " + mobileNumber +
                " emailId : " + emailId ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
