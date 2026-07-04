package in.co.nmsworks.training.week3.day5;

public class TelephoneBook {
    public String name;
    public Integer phNo;
    public String emailID;

    public TelephoneBook(String name, Integer phNo, String emailID) {
        this.name = name;
        this.phNo = phNo;
        this.emailID = emailID;
    }

    public TelephoneBook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhNo() {
        return phNo;
    }

    public void setPhNo(Integer phNo) {
        this.phNo = phNo;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "TelephoneBook{" +
                "name='" + name + '\'' +
                ", phNo=" + phNo +
                ", emailID='" + emailID + '\'' +
                '}';
    }

}
