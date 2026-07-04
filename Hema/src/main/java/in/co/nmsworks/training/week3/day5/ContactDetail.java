package in.co.nmsworks.training.week3.day5;

public class ContactDetail {
    private String name;
    private long mobile;
    private String emailId;

    public ContactDetail(String name, long mobile, String emailId) {
        this.name = name;
        this.mobile = mobile;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "ContactDetail{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
