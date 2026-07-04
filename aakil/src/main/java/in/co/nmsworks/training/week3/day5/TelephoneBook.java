package in.co.nmsworks.training.week3.day5;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    private Map<String, ContactDetail> contactDetailMap;

    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.addContact(new ContactDetail("Aakil", "976543218", "aakil@a.kl"));
        telephoneBook.addContact(new ContactDetail("Farhaan", "67548321", "farhaan@f.hn"));
        telephoneBook.addContact(new ContactDetail("Satheesh", "648732187", "satheesh@s.ha"));

        telephoneBook.displayAllContacts();

        ContactDetail contactDetail = telephoneBook.getContact("Aakil");
        System.out.println("searched contact :: " + contactDetail);
    }

    public TelephoneBook() {
        contactDetailMap = new HashMap<>();
    }

    public void displayAllContacts() {
        System.out.println("NAME     >  CONTACT DETAIL");
        contactDetailMap.forEach((name , contactInfo) -> System.out.println(name + "  >  " + contactInfo));
    }

    public void addContact(ContactDetail newContact){
        contactDetailMap.put(newContact.getName(), newContact);
    }

    public ContactDetail getContact(String name){
        ContactDetail contact =  contactDetailMap.get(name);
        if (contact == null){
            System.out.println("No Contact : " + name);
        }
        return contact;
    }
}
