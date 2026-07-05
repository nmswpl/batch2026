package in.co.nmsworks.training.week3.day5.TelephoneBook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added Successfully.");
    }

    public void searchContact(String name) {

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }
}