package in.co.nmsworks.training.week3.day5.telephonebook;

public class ContactInfo {
    private int id;
    private String name;
    private String email;
    private String mobileNum;

    public ContactInfo(int id, String name, String email, String mobileNum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                '}';
    }
}
