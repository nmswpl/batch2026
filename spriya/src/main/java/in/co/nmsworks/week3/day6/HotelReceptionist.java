package in.co.nmsworks.week3.day6;

import java.util.Scanner;

public class HotelReceptionist {

    public static void main(String[] args) {

        HotelReceptionist hotelReceptionist = new HotelReceptionist();

        hotelReceptionist.getDetails();

    }

    private void getDetails() {

        GuestDetails guestDetails = new GuestDetails();

        try (Scanner sc = new Scanner(System.in)) {

            int choice = 0;

            while (choice != 7) {

                System.out.println();
                System.out.println("1.New Entry");
                System.out.println("2.Old Entry");
                System.out.println("3.Check In");
                System.out.println("4.Check Out");
                System.out.println("5.Display Details");
                System.out.println("6.Get My Id");
                System.out.println("7.Exit");

                System.out.print("Enter Your Choice : ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("Enter your name : ");
                        String name = sc.next();

                        System.out.print("Preferred Language : ");
                        String language = sc.next();

                        guestDetails.setName(name);
                        guestDetails.setLanguage(language);

                        guestDetails.generateId();
                        guestDetails.generateDetails();

                        break;

                    case 2:

                        System.out.print("Enter your Id : ");
                        int id = sc.nextInt();

                        guestDetails.getOldEntry(id);

                        break;

                    case 3:

                        System.out.print("Enter your Id : ");
                        int guestId = sc.nextInt();

                        guestDetails.getDetailsForCheckIn(guestId);

                        break;

                    case 4:

                        System.out.print("Enter your Id : ");
                        int guestIdOut = sc.nextInt();

                        guestDetails.getDetailsForCheckOut(guestIdOut);

                        break;

                    case 5:

                        System.out.print("Enter your Id : ");
                        int idDetails = sc.nextInt();

                        guestDetails.displayDetails(idDetails);

                        break;

                    case 6:

                        System.out.print("Enter your Name : ");
                        String guestName = sc.next();

                        guestDetails.getId(guestName);

                        break;

                    case 7:

                        System.out.println("Thank You!");
                        break;

                    default:

                        System.out.println("Invalid Choice");

                }

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}