package in.co.nmsworks.training.week3.day5.telephonebook;

public class TelephoneBookRunner {
    public static void main(String[] args) {

        ContactInfo kowshik = new ContactInfo(1, "kowshik", "k@gmail.com", "9629588199");
        ContactInfo senthil = new ContactInfo(2, "senthil", "s@gmail.com", "9647477382");
        ContactInfo murugan = new ContactInfo(3, "murugan", "m@gmail.com", "9432432232");

        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.addContact(kowshik);
        telephoneBook.addContact(senthil);
        telephoneBook.addContact(murugan);

//        System.out.println("Telephone book : " + telephoneBook.getMap());

        telephoneBook.searchContact("kowshik");
    }

}
