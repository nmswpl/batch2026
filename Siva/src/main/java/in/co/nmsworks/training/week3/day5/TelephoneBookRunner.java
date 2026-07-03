package in.co.nmsworks.training.week3.day5;

public class TelephoneBookRunner {
    public static void main(String[] args) {
        TelephoneBook tb = new TelephoneBook();
        tb.setNameToContact(new Contact("Siva","9876543210","siva@gmail.com"));
        tb.setNameToContact(new Contact("Pandi","9876543210","siva@gmail.com"));
        tb.setNameToContact(new Contact("Satheesh","9876543210","siva@gmail.com"));
        tb.setNameToContact(new Contact("Abi","9876543210","siva@gmail.com"));
        System.out.println(tb.searchContactUsingName("Siva"));
    }
}
