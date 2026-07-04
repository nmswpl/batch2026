package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {
    private List<ContactDetails> contactDetailsList = new ArrayList<>();
    public void searchContactByName(String name){
        for (ContactDetails contactDetails : contactDetailsList) {
            if (contactDetails.getName().equals(name)){
                System.out.println(contactDetails);
                return;
            } else {
                System.out.println("Contact not found");
            }
        }

    }

    public void addContact(ContactDetails contactDetails){
        contactDetailsList.add(contactDetails);
        System.out.println("Contact added");
    }

    public List<ContactDetails> getContactDetailsList() {
        return contactDetailsList;
    }

    public void setContactDetailsList(List<ContactDetails> contactDetailsList) {
        this.contactDetailsList = contactDetailsList;
    }
}
