package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TelephoneBook {

    private static List<ContactDetails> contacts = new ArrayList<>();

    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.addContact("Roshika", 987656890, "rosika@devi.edu.in");
        telephoneBook.addContact("Gobika",1234567890,"gobika@nms.co.in");
        telephoneBook.addContact("Praba",2143658709,"praba@gmail.com");
        System.out.println("Contact Details\n" + contacts);
        telephoneBook.searchContacts("Gobika");
        telephoneBook.searchContacts("Girija");
    }

    private void searchContacts(String name) {
        boolean isFound = false;
        for (ContactDetails contact : contacts) {
            if (name.equals(contact.getName())){
                System.out.println("Name : "+contact.getName() + "\nMobile Number : "+ contact.getMobileNo() + "\nEmail Id : "+contact.getEmailId());
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Contact not Found...");
        }

    }

    private void addContact(String name, long phNo, String email) {
        ContactDetails contactDetails = new ContactDetails(name, phNo, email);
        contacts.add(contactDetails);
    }


}