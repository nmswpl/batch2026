package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelephoneRunner {
    public static void main(String[] args) {
        List<TelephoneBook> telephoneBooks = new ArrayList<>();
        searchContact(telephoneBooks);
    }

    private static void searchContact(List<TelephoneBook> telephoneBooks) {
        telephoneBooks.add(new TelephoneBook("Jems","8778621234","jemunau@nmsworks.co.in"));
        telephoneBooks.add(new TelephoneBook("Anu","9782312345","anusri@nmsworks.co.in"));
        telephoneBooks.add(new TelephoneBook("Hems","974562345","hemabr@nmsworks.co.in"));
        System.out.println("Enter the name to display their contact details : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (TelephoneBook telephoneBook : telephoneBooks) {
            if(telephoneBook.getName().equalsIgnoreCase(name)){
                System.out.println(telephoneBook);
            }

        }
    }
}
