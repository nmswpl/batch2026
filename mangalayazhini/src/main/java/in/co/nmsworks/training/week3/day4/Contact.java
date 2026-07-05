package in.co.nmsworks.training.week3.day4;

public class Contact {
    private String name;
    private  String mobileNo;
    private String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Contact(String name, String mobileNo, String emailId) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }
}
