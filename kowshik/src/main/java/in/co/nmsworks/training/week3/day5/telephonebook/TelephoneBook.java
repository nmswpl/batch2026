package in.co.nmsworks.training.week3.day5.telephonebook;

import java.util.*;

public class TelephoneBook {
    private Map<Character, List<ContactInfo>> map = new HashMap<>();

    public Map<Character, List<ContactInfo>> getMap() {
        return map;
    }

    public void addContact(ContactInfo contactInfo) {
        char letter = contactInfo.getName().trim().charAt(0);
        map.computeIfAbsent(Character.toUpperCase(letter), v -> new ArrayList<>()).add(contactInfo);
        System.out.println("Contact : " + contactInfo.getName() + " added successfully!!");
    }

    public List<ContactInfo> searchContact(String name) {
        char firstLetter = Character.toUpperCase(name.charAt(0));
        List<ContactInfo> contactInfos = map.get(firstLetter);

        List<ContactInfo> availableContactsMatchingName = new ArrayList<>();

        for (ContactInfo contactInfo : contactInfos) {
            if(contactInfo.getName().equalsIgnoreCase(name)) {
                availableContactsMatchingName.add(contactInfo);
            }
        }

        if(availableContactsMatchingName.isEmpty()) {
            System.out.println("Contact name : " + name + " not present in telephone book!");
            return Collections.emptyList();
        }

        System.out.println("Contact found : " + availableContactsMatchingName);
        return availableContactsMatchingName;
    }
}
