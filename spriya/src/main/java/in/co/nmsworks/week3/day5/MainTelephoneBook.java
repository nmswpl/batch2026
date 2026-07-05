package in.co.nmsworks.week3.day5;

import java.util.*;

public class MainTelephoneBook {

    public static void main(String[] args) {

        MainTelephoneBook mainTelephoneBook = new MainTelephoneBook();

        List<TelephoneBook> mobileOwnerDetails = mainTelephoneBook.getOwnerDetails();

        mainTelephoneBook.printOwnerDetails(mobileOwnerDetails);
    }

    private void printOwnerDetails(List<TelephoneBook> mobileOwnerDetails) {

        Map<String, List<List<String>>> numberList = new HashMap<>();

        // Store all contacts in Map
        for (TelephoneBook owner : mobileOwnerDetails) {

            String name = owner.getName();

            List<List<String>> finalList = numberList.getOrDefault(name, new ArrayList<>());

            List<String> list = new ArrayList<>();
            list.add(owner.getMobileNumber());
            list.add(owner.getEmailId());

            finalList.add(list);

            numberList.put(name, finalList);
        }

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 3) {

            System.out.println("\n1. Search Contact");
            System.out.println("2. Add Contact");
            System.out.println("3. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name : ");
                    String searchName = sc.nextLine();

                    List<List<String>> details = numberList.get(searchName);

                    if (details == null) {
                        System.out.println("Contact Not Found");
                    } else {

                        System.out.println("Name : " + searchName);

                        for (List<String> contact : details) {

                            System.out.println("Mobile : " + contact.get(0));
                            System.out.println("Email  : " + contact.get(1));
                            System.out.println();
                        }
                    }

                    break;

                case 2:

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Mobile Number : ");
                    String mobile = sc.nextLine();

                    System.out.print("Enter Email Id : ");
                    String email = sc.nextLine();

                    TelephoneBook telephoneBook = new TelephoneBook(name, mobile, email);

                    mobileOwnerDetails.add(telephoneBook);

                    List<List<String>> finalList = numberList.getOrDefault(name, new ArrayList<>());

                    List<String> list = new ArrayList<>();
                    list.add(mobile);
                    list.add(email);

                    finalList.add(list);

                    numberList.put(name, finalList);

                    System.out.println("Contact Added Successfully.");

                    break;

                case 3:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }

    private List<TelephoneBook> getOwnerDetails() {

        TelephoneBook owner1 = new TelephoneBook("Priya", "9999888876", "abc@gmail.com");
        TelephoneBook owner2 = new TelephoneBook("Rajaa", "9876543210", "efgraja@gmail.com");
        TelephoneBook owner3 = new TelephoneBook("Priya", "9894326618", "priya567@gmail.com");
        TelephoneBook owner4 = new TelephoneBook("Ramu", "1234567891", "ramu@gmail.com");
        TelephoneBook owner5 = new TelephoneBook("Isha", "987612345", "isha@gmail.com");
        TelephoneBook owner6 = new TelephoneBook("Aryan", "9123456123", "aryan@gmail.com");
        TelephoneBook owner7 = new TelephoneBook("Isha", "5678943210", "isha67@gmail.com");

        List<TelephoneBook> list = new ArrayList<>();

        list.add(owner1);
        list.add(owner2);
        list.add(owner3);
        list.add(owner4);
        list.add(owner5);
        list.add(owner6);
        list.add(owner7);

        return list;
    }
}