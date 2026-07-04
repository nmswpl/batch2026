package in.co.nmsworks.training.week3.day5;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

    Map<String,ContactDetail> contactMap = new HashMap<>();

    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        ContactDetail contact = new ContactDetail("Hema",98765432,"hema@gmail.com");

        telephoneBook.addContact(contact);
        telephoneBook.addContact(new ContactDetail("Thanu",34567889,"thanu@gmail.com"));

        telephoneBook.searchContact("Hema");
        telephoneBook.searchContact("Sri");
    }

    private void searchContact(String name) {
        if(contactMap.containsKey(name))
            System.out.println(contactMap.get(name));
        else
            System.out.println("Contact not present!");
    }

    private void addContact(ContactDetail contact) {
        contactMap.put(contact.getName(),contact);
        System.out.println("Contact added!");
    }

}
