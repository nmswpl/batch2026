package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class PhonebookRunner {
    List<ContactDetails> contacts = new ArrayList<>();
    public static void main(String[] args) {

        PhonebookRunner runner = new PhonebookRunner();
        runner.addContact("Aakil", "9876543210", "aakil@gmail.com");
        runner.addContact("Farhaan", "9876501234", "farhaan@gmail.com");
        runner.addContact("Sathish", "9876511111", "sathish@gmail.com");
        runner.searchContact("Aakil");
        runner.searchContact("Anas");
    }

    public void addContact(String name, String mobile, String email) {
        contacts.add(new ContactDetails(name, mobile, email));
        System.out.println("Contact Added Successfully.");
    }

    public void searchContact(String name) {
        for (ContactDetails contactDetails : contacts) {
            if (contactDetails.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact " + name + " Found");
                System.out.println(contactDetails);
                return;
            }
        }
        System.out.println("Contact " + name + " Not Found.");
    }

}