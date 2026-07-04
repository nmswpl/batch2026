package in.co.nmsworks.training.week3.day5;

public class ContactDetails {
    private String name;
    private Long mobileNo;
    private String emailId;

    public ContactDetails() {}

    public ContactDetails(String name, Long mobileNo, String emailId) {
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

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
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
        return "Name: " + name +
                ", Mobile No: " + mobileNo +
                ", e-mail Id: " + emailId;
    }
}
