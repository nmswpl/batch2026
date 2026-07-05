package in.co.nmsworks.training.week3.day5.teleBook;

import java.util.Objects;

public class ContactDetails{
    private String name;
    private String mobile;
    private String email;

    public ContactDetails() {
    }

    public ContactDetails(String name, String mobile, String email) {
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
        ContactDetails that = (ContactDetails) o;
        return Objects.equals(name, that.name) && Objects.equals(mobile, that.mobile) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobile, email);
    }

    @Override
    public String toString() {
        return "ContactDeatails{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}
