package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class TelephoneBookRunner {
    public static void main(String[] args) {
        TelephoneBookRunner telephoneBookRunner = new TelephoneBookRunner();
        telephoneBookRunner.run();
    }

    private void run() {
        TelephoneBook telephoneBook = new TelephoneBook();
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 4)
            {
                System.out.println("1. Search contact by name");
                System.out.println("2. Add contact");
                System.out.println("3. Show all contacts");
                System.out.println("4. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter the name by which to search ");
                        System.out.flush();
                        String name = scanner.next();
                        telephoneBook.searchContactByName(name);
                        break;

                    case 2:
                        System.out.println("Enter contact name to add: ");
                        System.out.flush();
                        String nameAdd = scanner.next();
                        System.out.println("Enter contact mobile no. to add: ");
                        System.out.flush();
                        Long mobileNo = scanner.nextLong();
                        System.out.println("Enter contact e-mail id to add: ");
                        System.out.flush();
                        String emailid = scanner.next();

                        ContactDetails contactDetails = new ContactDetails(nameAdd, mobileNo, emailid);
                        telephoneBook.addContact(contactDetails);

                        break;

                    case 3:
                        for (ContactDetails details : telephoneBook.getContactDetailsList()) {
                            System.out.println(details);
                        }
                        break;

                    case 4:
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
