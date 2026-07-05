package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class TelephoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try
        {
            int choice = 0;
            PhoneBook phoneBook = new PhoneBook();
            while (choice != 3)
            {
                System.out.println("1. Add Contact");
                System.out.println("2. Search Contact By Name");
                System.out.println("3. Exit \n");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter Email ID: ");
                        String emailId = scanner.nextLine();
                        System.out.print("Enter Mobile Number: ");
                        String mobile = scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        Contact newContact = new Contact(name,mobile,emailId);
                        phoneBook.addContact(newContact);
                        break;

                    case 2:
                        System.out.print("Enter Name: ");
                        String searchName = scanner.nextLine();
                        phoneBook.searchContactByName(searchName);
                        break;
                    case 3 :
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
        finally {
            scanner.close();
        }
    }
}
