package in.co.nmsworks.training.week3.day5;

import java.util.Objects;

public class TelephoneBook {

    private String name;
    private String mobile;
    private String email;

    public TelephoneBook(String name, String mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneBook that = (TelephoneBook) o;
        return Objects.equals(name, that.name) && Objects.equals(mobile, that.mobile) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobile, email);
    }

    @Override
    public String toString() {
        return "TelephoneBook{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
