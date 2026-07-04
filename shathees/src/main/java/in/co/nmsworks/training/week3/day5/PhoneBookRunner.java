package in.co.nmsworks.training.week3.day5;

import java.util.*;

public class PhoneBookRunner {
    public static void main(String[] args) {
        List<ContactDetail> list = new ArrayList<>();
        Map<String, ContactDetail> phoneBook = new HashMap<>();

        list.add(new ContactDetail("aakhil", "987654321", "a@gmail.com"));
        list.add(new ContactDetail("shathees", "987654321", "shathees@gmail.com"));
        list.add(new ContactDetail("lokesh", "987654321", "Lok@gmail.com"));


        for (ContactDetail contactDetail : list) {
            phoneBook.put(contactDetail.getName(), contactDetail);

        }
        //searchByname("aakhil", phoneBook);
        //searchByname("lokesh",phoneBook);
        addContact("farhaan","1234456677","f@gmail.com",phoneBook,list);
        searchByname("farhaan",phoneBook);


    }

    private static void addContact(String farhaan, String number, String mail, Map<String, ContactDetail> phoneBook, List<ContactDetail> list) {
        list.add(new ContactDetail(farhaan,number,mail));
        phoneBook.put(farhaan,new ContactDetail(farhaan,number,mail));
        System.out.println("conatct added");
    }


    private static void searchByname(String name, Map<String, ContactDetail> conatct) {
        if (conatct.containsKey(name)) {
            System.out.println( name + "  details : " + conatct.get(name));
        }
    }
}
