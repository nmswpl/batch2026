package in.co.nmsworks.training.week3.day5;

public class ContactDetails {
    private String name;
    private long mobileNo;
    private String emailId;

    public ContactDetails(String name, long mobileNo, String emailId) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
