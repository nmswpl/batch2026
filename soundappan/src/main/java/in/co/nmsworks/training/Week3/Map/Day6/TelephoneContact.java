package in.co.nmsworks.training.Week3.Map.Day6;


import java.util.HashMap;
import java.util.Map;

public class TelephoneContact extends TelephoneBook {

    private Map<String, TelephoneBook> map;

    public TelephoneContact() {
        map = new HashMap<>();
    }

    public void addContact(TelephoneBook contact) {

        if (map.containsKey(contact.getName())) {
            System.out.println("Contact already exists.");
        } else {
            map.put(contact.getName(), contact);
            System.out.println("Contact added successfully.");
        }
    }

    public void searchContact(String name) {

        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String name) {

        if (map.remove(name) != null) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void displayContacts() {

        if (map.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("\nAll Contacts");

        for (TelephoneBook contact : map.values()) {
            System.out.println(contact);
        }
    }
}

