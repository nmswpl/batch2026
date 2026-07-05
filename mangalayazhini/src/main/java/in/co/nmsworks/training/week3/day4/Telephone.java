package in.co.nmsworks.training.week3.day4;

import java.util.HashMap;
import java.util.Map;

public class Telephone {
    Map<String, Contact> contactMap = new HashMap<>();

    public void addContact(Contact userContact){
        contactMap.put(userContact.getName(), userContact);
    }

    public void search(String name){
        Contact matchedContact = contactMap.get(name);
        if(matchedContact == null){
            System.out.println("No such contact exist !");
        }
        else{
            System.out.println("Contact Details :");
            System.out.println("Name : " + matchedContact.getName() + " Email :"+ matchedContact.getEmailId()
                    +" Phno :"+matchedContact.getMobileNo() );
        }


    }
}
