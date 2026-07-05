package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactRunner {
    static List<Contact> contacts = new ArrayList<>();
    public static void main(String[] args) {
        ContactRunner contactRunner = new ContactRunner();
        contactRunner.addContact("Brathika","7603999862","brathikaramesh@gmail.com");
        contactRunner.addContact("Anu","7373658883","anuramesh@gmail.com");
        System.out.println(contacts);
        contactRunner.searchContact("Brathika");

    }

    private void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Contact found");
            }
        }
    }

    private void addContact(String name, String number, String mail) {
        Contact contact = new Contact(name, number, mail);
        contacts.add(contact);

    }
}
