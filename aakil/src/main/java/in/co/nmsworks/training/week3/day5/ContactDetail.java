package in.co.nmsworks.training.week3.day5;

public class ContactDetail {
    private String name;
    private String mobile;
    private String emailId;

    public ContactDetail(String name, String mobile, String emailId) {
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
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
        return "[ name='" + getName() + '\'' +
                ", mobile='" + getMobile() + '\'' +
                ", emailId='" + getEmailId() + '\'' +
                " ]";
    }
}
