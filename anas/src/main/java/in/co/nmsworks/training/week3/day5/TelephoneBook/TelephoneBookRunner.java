package in.co.nmsworks.training.week3.day5.TelephoneBook;

import java.util.Scanner;

public class TelephoneBookRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TelephoneBook telephoneBook = new TelephoneBook();

        while (true) {

            System.out.println("\n1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Mobile : ");
                    String mobile = sc.nextLine();

                    System.out.print("Enter Email : ");
                    String email = sc.nextLine();

                    telephoneBook.addContact(new Contact(name, mobile, email));
                    break;

                case 2:

                    System.out.print("Enter Name to Search : ");
                    String searchName = sc.nextLine();

                    telephoneBook.searchContact(searchName);
                    break;

                case 3:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
