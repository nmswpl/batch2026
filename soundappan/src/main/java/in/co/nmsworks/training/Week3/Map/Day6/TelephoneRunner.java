package in.co.nmsworks.training.Week3.Map.Day6;



public class TelephoneRunner {

    public static void main(String[] args) {

        TelephoneContact contacts = new TelephoneContact();

        TelephoneBook c1 = new TelephoneBook(
                "Sachin",
                9876543210L,
                "sachin@gmail.com");

        TelephoneBook c2 = new TelephoneBook(
                "Rahul",
                9876543211L,
                "rahul@gmail.com");

        TelephoneBook c3 = new TelephoneBook(
                "Arun",
                9876543212L,
                "arun@gmail.com");

        contacts.addContact(c1);
        contacts.addContact(c2);
        contacts.addContact(c3);

        contacts.displayContacts();

        System.out.println("Searching Rahul");
        contacts.searchContact("Rahul");

        System.out.println("Deleting Arun");
        contacts.deleteContact("Arun");

        System.out.println("After Delete");
        contacts.displayContacts();
    }
}