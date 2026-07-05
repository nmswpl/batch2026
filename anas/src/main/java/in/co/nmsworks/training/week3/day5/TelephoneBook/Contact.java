package in.co.nmsworks.training.week3.day5.TelephoneBook;

public class Contact {

    private String name;
    private String mobile;
    private String email;

    public Contact(String name, String mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name : " + name +
                "\nMobile : " + mobile +
                "\nEmail : " + email;
    }
}