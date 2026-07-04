package in.co.nmsworks.training.week3.day5;

import in.co.nmsworks.training.week3.day5.TelephoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class TelephoneBookRunner {
    public static void main(String[] args) {
        TelephoneBook[] contactArray = new TelephoneBook[10];
        String[] names = {"Mohana", "abi", "subi", "fathima", "manoj"};
        Integer[] phNo = {934558333, 944765737, 944765737, 944765737, 944765737};
        String[] emailID = {"smohana@gmail.com", "asdnj@gam.com", "asdnj@gam.com", "asdnj@gam.com", "asdnj@gam.com"};

        List<TelephoneBook> contactDetailsList = new ArrayList<>();
        Map<String, List<TelephoneBook>> map = new HashMap<>();

        for (int t = 0; t < names.length; t++) {
            contactArray[t] = new TelephoneBook(names[t], phNo[t], emailID[t]);
            contactDetailsList.add(contactArray[t]);

            map.putIfAbsent(names[t], new ArrayList<>());
            map.get(names[t]).add(contactArray[t]);
        }

        System.out.println("--- Printing Array ---");
        for (TelephoneBook t : contactArray) {
            System.out.println(t);
        }

        System.out.println("\n--- Printing List ---");
        for (TelephoneBook contact : contactDetailsList) {
            System.out.println(contact);
        }

        System.out.println("\n--- Printing Map ---");
        for (Map.Entry<String, List<TelephoneBook>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("Adding Contact ");
        TelephoneBook e = new TelephoneBook("Mano", 98464553, "manjd@gmail.com");
        contactArray[names.length + 1] = e;
        contactDetailsList.add(e);
        map.putIfAbsent("Mano",new ArrayList<>());
        map.get("Mano").add(e);

        System.out.println(map.get("Mano"));
    }
}
