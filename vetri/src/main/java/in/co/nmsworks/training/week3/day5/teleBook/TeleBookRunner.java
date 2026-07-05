package in.co.nmsworks.training.week3.day5.teleBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeleBookRunner {

    Map<Character,List<ContactDetails>> telebook = new HashMap<>();


    public static void main(String[] args) {
        TeleBookRunner t1=new TeleBookRunner();
        t1.addContact("vetri","852502771","vetri@email.com");
        t1.search("vetri");
        t1.addContact("anas","873672638","ghdh");
        t1.search("db");

    }

    private void search(String name) {
        if (name==null || name.isEmpty()){
            return;
        }

        char firstchar = name.charAt(0);
        char upperCase = Character.toUpperCase(firstchar);
        if (!telebook.containsKey(upperCase)){
            System.out.println("Name Not found on the Telebook");
            return;
        }

        for (ContactDetails contact:telebook.get(upperCase)){
            if (contact.getName().equalsIgnoreCase(name)){
                System.out.println("Name Found on the TeleBook");
                System.out.println(contact.getName());
                System.out.println(contact.getMobile());
                System.out.println(contact.getEmail());
            }

        }
    }

    private void addContact(String name,String ph,String email) {
        if (name==null || name.isEmpty()){
            return;
        }
        ContactDetails c1=new ContactDetails(name,ph,email);
        Character firstChar = name.charAt(0);
        char upperCased = Character.toUpperCase(firstChar);
        if (!telebook.containsKey(upperCased)){
            telebook.put(upperCased,new ArrayList<>());
        }
        telebook.get(upperCased).add(c1);
        System.out.println("Added name "+name + " to the Page "+upperCased);

    }




}
