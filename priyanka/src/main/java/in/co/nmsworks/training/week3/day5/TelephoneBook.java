package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        ContactDetails contact1 = new ContactDetails("Priyanka",12340,"priyanka@gmail.com");
        ContactDetails contact2 = new ContactDetails("Sunitha",78654,"sunitha@gmail.com");
        ContactDetails contact3 = new ContactDetails("Nandhini",12345,"priyanka@gmail.com");
        ContactDetails contact4 = new ContactDetails("Maha",34678,"priyanka@gmail.com");
        ContactDetails contact5 = new ContactDetails("Mahes",56890,"priyanka@gmail.com");
        ContactDetails contact6 = new ContactDetails("Prathi",34567,"prathi@gmail.com");

        List<ContactDetails> contacts = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);

        Map<Character,List<ContactDetails>> telephoneBook = new HashMap<>();
        ContactDetails contact = new ContactDetails();
        List<Character> alphabets = contact.getAlphabet();

        Map<Character,List<ContactDetails>> initialToContactsMap =  createMap(contacts);
        searchContact(initialToContactsMap,"Mahes");


    }

    private static void searchContact( Map<Character,List<ContactDetails>> initialToContactsMap,String name) {
        Character initial = Character.toUpperCase(name.charAt(0));

        List<ContactDetails> contacts = initialToContactsMap.get(initial);
        if (contacts == null) {
            System.out.println("Contact not found");
            return;
        }
        for (ContactDetails contact : contacts) {
            if(contact.getName().equalsIgnoreCase(name)){
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Contact  not found");

    }

    private static  Map<Character,List<ContactDetails>> createMap( List<ContactDetails> contacts) {
        Map<Character,List<ContactDetails>> telephoneBook = new HashMap<>();
        for (ContactDetails contact : contacts) {
            char initial = Character.toUpperCase(contact.getName().charAt(0));
            List<ContactDetails> contactDetailsList = telephoneBook.get(initial);
            if(contactDetailsList == null){
                contactDetailsList = new ArrayList<>();
                telephoneBook.put(initial,contactDetailsList);
            }
            contactDetailsList.add(contact);
        }
        return telephoneBook;
    }

}
