package in.co.nmsworks.training.week3.weekendpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {
    private Map<Character, List<Contact>> nameToContact = new HashMap<>();

    public Map<Character, List<Contact>> getNameToContact() {
        return nameToContact;
    }

    public void setNameToContact(Contact contact) {
        List<Contact> currnetInitialContact = nameToContact.get(contact.getName().charAt(0));
        if (currnetInitialContact == null) {
            currnetInitialContact = new ArrayList<>();
            nameToContact.put(contact.getName().charAt(0), currnetInitialContact);
        }
        currnetInitialContact.add(contact);
    }

    public Contact searchContactUsingName(String name) {
        List<Contact> currnetInitialContact = nameToContact.get(name.charAt(0));
        for (Contact contact : currnetInitialContact) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
}

