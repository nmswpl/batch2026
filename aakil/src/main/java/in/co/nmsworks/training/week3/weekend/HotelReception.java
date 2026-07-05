package in.co.nmsworks.training.week3.weekend;

import java.util.Scanner;

public class HotelReception {
    public static void main(String[] args) {
        HotelReception reception = new HotelReception();
        GuestDatabase guestDatabase = new GuestDatabase();
        Scanner scanner = new Scanner(System.in);
        Guest guest = new Guest(0, "john", Language.TA);
        while (true){
            System.out.println("A GUEST ARRIVES !!");
            System.out.print("AUTOMATED RECEPTION :: Are You a New Guest ? ( Y / N ) : ");
            char choice = scanner.nextLine().toLowerCase().charAt(0);


            if (choice == 'y'){
                System.out.println("NEW GUEST :: ");
                System.out.println("NAME : ");
                String name = scanner.nextLine();
                for (Language language : Language.values()) {
                    System.out.println(language.name() + " - " + language.getDisplayName());
                }
                System.out.println("PREFERRED LANGUAGE (Enter Code): ");
                Language preferredLang = Language.valueOf(scanner.nextLine().toUpperCase().trim());
                guest = guestDatabase.createGuest(name, preferredLang);
                System.out.println(guest.getName() + " ADDED AS NEW GUEST!!");
                System.out.println("*************************************");
                System.out.println(guest);
                System.out.println("*************************************");
            } else if (choice == 'n'){
                System.out.println("Enter Your Unique Guest Id : ");
                int guestId = Integer.parseInt(scanner.nextLine());
                guest = guestDatabase.getGuestById(guestId);
                if (guest == null){
                    System.out.println("ERROR : GUEST ID NOT FOUND");
                    continue;
                } else {
                    System.out.println(guest.getPreferredLanguage().getGreeting() + "," + guest.getName());
                }
            }

            System.out.println("IN - CHECK IN");
            System.out.println("OUT - CHECK OUT");

            choice = scanner.nextLine().toLowerCase().charAt(0);
            if(choice == 'i'){
                reception.checkIn(guest);
            } else if (choice == 'o') {
                reception.checkOut(guest);
            }

            System.out.println("WANNA EXIT ? (Y / N) : ");
            choice = scanner.nextLine().toLowerCase().charAt(0);
            if (choice == 'y') break;
        }
    }

    private void checkOut(Guest guest) {
        System.out.println(guest.getPreferredLanguage().getFarewell() + ", " + guest.getName());
    }

    private void checkIn(Guest guest) {
        System.out.println(guest.getPreferredLanguage().getGreeting() + ", " + guest.getName());
    }

}
