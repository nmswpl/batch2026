package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelephoneRunner {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        searchContact(contacts);
    }

    private static void searchContact(List<Contact> contacts) {
        contacts.add(new Contact("Jems","8778621234","jemunau@nmsworks.co.in"));
        contacts.add(new Contact("Anu","9782312345","anusri@nmsworks.co.in"));
        contacts.add(new Contact("Hems","974562345","hemabr@nmsworks.co.in"));
        System.out.println("Enter the name to display their contact details : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if(contact.getName().equalsIgnoreCase(name)){
                System.out.println(contact);
            }
        }
        scanner.close();
    }
}
