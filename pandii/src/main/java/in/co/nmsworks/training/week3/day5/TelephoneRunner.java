package in.co.nmsworks.training.week3.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneRunner {
    public static void main(String[] args) {
        TelephoneRunner telephoneRunner=new TelephoneRunner();
        telephoneRunner.run();
    }

    private  Map<String,Contact> nameToContact=new HashMap<>();

    public void addContact(String name,String phone,String email) {
        Contact contact=new Contact(name,phone,email);

        nameToContact.put(name,contact);
        System.out.println("Contact Added Successfully!!");
    }

    private void searchContact(String name) {
        Contact contact=nameToContact.get(name);

        if(contact!=null)
        {
            System.out.println(contact.getName()+" "+contact.getPhNo()+" "+contact.getEmail());
        }
        else {
            System.out.println("No match found");
        }
    }
    private void run()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 3)
            {
                System.out.println("1. Search Contact");
                System.out.println("2. Add Contact");
                System.out.println("3. Exit\n");


                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter name to search");
                        searchContact(scanner.next());
                        break;

                    case 2:
                        System.out.println("Enter name");
                        String name=scanner.next();
                        System.out.println("Enter phno");
                        String phno=scanner.next();
                        System.out.println("Enter email");
                        String email=scanner.next();
                        addContact(name,phno,email);
                        break;

                    case 3:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Choice "+ choice);
                }
            }


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
