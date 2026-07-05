package in.co.nmsworks.training.week3.day5;

import java.util.*;

public class PhoneBook {
    private Map<String, List<Contact>> phoneBookMap;

    public PhoneBook() {
        this.phoneBookMap = new HashMap<>();
    }

    public PhoneBook(Map<String, List<Contact>> phoneBookMap) {
        this.phoneBookMap = phoneBookMap;
    }

    public void addContact(Contact contact) {
        String name = contact.getName().toLowerCase().trim();
        phoneBookMap.putIfAbsent(name, new ArrayList<>());
        phoneBookMap.get(name).add(contact);
        System.out.println("Contact Added Successfully");
    }
    public void searchContactByName(String name) {
        String searchName = name.toLowerCase().trim();
        if (phoneBookMap.containsKey(searchName)) {
            List<Contact> matchedContacts = phoneBookMap.get(searchName);
            System.out.println("Contacts Matched for " + name + " are : ");
            for (Contact contact : matchedContacts) {
                System.out.println(contact);
            }
            System.out.println("Total no of matched contacts : " + matchedContacts.size());
        }
        else {
            System.out.println("Requested contact " + name + " not found");
        }
    }

}
