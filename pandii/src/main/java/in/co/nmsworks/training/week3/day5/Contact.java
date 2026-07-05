package in.co.nmsworks.training.week3.day5;

public class Contact {
    private String name;
    private String phNo;
    private String email;

    public Contact(String name, String phNo, String email) {
        this.name = name;
        this.phNo = phNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phNo=" + phNo +
                ", email='" + email + '\'' +
                '}';
    }
}
