package in.co.nmsworks.training.week3.day5;

import java.util.Objects;

public class Telephone {
    private  String name;
    private String mobile;
    private String emailId;

    public Telephone(String name, String mobile, String emailId) {
        this.name = name;
        this.mobile = mobile;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Telephone telephone = (Telephone) o;
        return Objects.equals(name, telephone.name) && Objects.equals(mobile, telephone.mobile) && Objects.equals(emailId, telephone.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobile, emailId);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }


}
