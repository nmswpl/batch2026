package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class RunnerTelephone {
    private static List<Telephone> phoneBook = new ArrayList<>();
    public static void main(String[] args) {

        addContact(new Telephone("Anu", "9087806345", "anu123@gmail.com"));
        addContact(new Telephone("jemuna", "6087806345", "jemuna123@gmail.com"));
        addContact(new Telephone("hema", "8087806345", "hema123@gmail.com"));
        System.out.println("--- Testing Search Feature ---");
        searchContact("Anu");
        searchContact("jemuna");
        searchContact("Suresh");
    }

    public static void addContact(Telephone contact) {
        if (contact != null) {
            phoneBook.add(contact);
            System.out.println("Added: " + contact.getName());
        }
    }

    public static void searchContact(String searchName) {
        boolean found = false;

        for (Telephone contact : phoneBook) {
            if (contact.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Contact Found -> " + contact);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact with name '" + searchName + "' not found.");
        }
    }
}
