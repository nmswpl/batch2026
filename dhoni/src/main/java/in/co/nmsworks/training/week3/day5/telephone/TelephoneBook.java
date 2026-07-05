package in.co.nmsworks.training.week3.day5.telephone;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {
    public static void main(String[] args) {

        TelephoneBook telephoneBook = new TelephoneBook();
        List<Contact> list = new ArrayList<>();

        list.add(new Contact("dhoni", 1234567889,"dhoni@gmail.com"));
        list.add(new Contact("karthi", 1234567888,"karthi@gmail.com"));
        list.add(new Contact("arun", 1234567887,"arun@gmail.com"));
        list.add(new Contact("alex", 1234567886,"alex@gmail.com"));
        list.add(new Contact("alan", 1234567886,"alan@gmail.com"));

        telephoneBook.searchContact("arun",list);

    }

    private void searchContact(String name, List<Contact> list) {
        for(Contact contact : list){
            if(name.equalsIgnoreCase(contact.getName())){
                System.out.println("Found contact");
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Contact of " + name + " Not found");
    }

}
