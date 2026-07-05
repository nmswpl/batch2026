package in.co.nmsworks.training.week3.day6.hotel;

import java.util.Scanner;

public class HotelReceptionist {

    public static void main(String[] args) {
        
        HotelReceptionist hotelReceptionist = new HotelReceptionist();
        hotelReceptionist.hotelApplication();

    }

    private void hotelApplication() {
        Scanner scanner = new Scanner(System.in);
        HotelManagement hotelManagement = new HotelManagement();

        int choice  = 0;

        while(choice != 5){
            System.out.println("Hotel");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. checkIn");
            System.out.println("4. checkOut");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){

                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter language: ");
                    String language = scanner.nextLine();

                    hotelManagement.register(name, language);
                    break;


                case 2:
                    System.out.print("Enter your guest ID: ");
                    int id = scanner.nextInt();
                    hotelManagement.login(id);
                    break;


                case 3:
                    System.out.print("Enter your guest ID: ");
                    id = scanner.nextInt();
                    hotelManagement.checkIn(id);
                    break;

                case 4:
                    System.out.print("Enter your guest ID: ");
                    id = scanner.nextInt();
                    hotelManagement.checkOut(id);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
        scanner.close();
    }

}
