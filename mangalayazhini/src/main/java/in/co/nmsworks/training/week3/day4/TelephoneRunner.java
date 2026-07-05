package in.co.nmsworks.training.week3.day4;

import java.util.concurrent.Callable;

public class TelephoneRunner {
    public static void main(String[] args) {
        Telephone telephoneBook = new Telephone();
        Contact contact1 = new Contact("Priya","8940021232", "priya@gmail.com");
        Contact contact2 = new Contact("Renu","6755342398", "renu@gmail.com");
        Contact contact3 = new Contact("Aambal","8733467290", "aambal@gmail.com");
        Contact contact4 = new Contact("Harini","9834667211", "harini@gmail.com");



        telephoneBook.addContact(contact1);
        telephoneBook.addContact(contact2);
        telephoneBook.addContact(contact3);
        telephoneBook.addContact(contact4);

        telephoneBook.search("Harini");


//       telephoneBook.
    }
}
