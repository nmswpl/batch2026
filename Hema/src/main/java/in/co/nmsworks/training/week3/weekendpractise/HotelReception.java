package in.co.nmsworks.training.week3.weekendpractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelReception {
    private static Map<String,String> welcomeInLanguages = new HashMap<>();
    private static Map<String,String> goodByeInLanguages = new HashMap<>();
    private static Map<Integer,Guest> hotelGuests = new HashMap<>();
    private static int hotelId = 1;

    public static void main(String[] args) {

        welcomeInLanguages.put("Tamil","Anbudan varaverkirom");
        welcomeInLanguages.put("English","Welcome");
        welcomeInLanguages.put("Hindi", "Aapka swagat hai");

        goodByeInLanguages.put("Tamil","Nandri, Meendum varuga");
        goodByeInLanguages.put("English","Thank you, Please visit again");
        goodByeInLanguages.put("Hindi","Dhanyavaad, Phir aayiye");

        System.out.println("welcome = > "+welcomeInLanguages);
        System.out.println("goodBye = > "+goodByeInLanguages);

        try (Scanner scanner = new Scanner(System.in))
        {

            int choice = 0;
            while (choice != 3)
            {
                System.out.println();
                System.out.println("1. New Guest");
                System.out.println("2. Existing Guest");
                System.out.println("3. Exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();


                switch (choice)
                {
                    case 1:
                        System.out.println("Enter your name : ");
                        String name = scanner.next();
                        System.out.println("Enter your preferred language : ");
                        String language = scanner.next();

                        int currentGuestId = hotelId;

                        hotelGuests.put(hotelId,new Guest(hotelId++,name,language));

                        System.out.println("\nYour GUEST ID is : "+currentGuestId);
                        System.out.println("\n(CHECK IN / CHECK OUT) ?\n Enter your option:\n1. CHECK IN\n2. CHECK OUT\n ");
                        int option = scanner.nextInt();

                        if(option == 1)
                        {
                            checkIn(hotelGuests.get(currentGuestId));
                        } else if (option == 2) {
                            checkOut(hotelGuests.get(currentGuestId));
                        }
                        else
                            System.out.println("Invalid option");
                        break;

                    case 2:
                        System.out.println("Enter guest ID : ");
                        Integer id = scanner.nextInt();
                        System.out.println("(CHECK IN / CHECK OUT) ?\n Enter your option:\n1. CHECK IN\n2. CHECK OUT\n ");
                        option = scanner.nextInt();

                        if(option == 1)
                        {
                            checkIn(hotelGuests.get(id));
                        }
                        else if (option == 2)
                        {
                            checkOut(hotelGuests.get(id));
                        }
                        else
                            System.out.println("Invalid option");

                        break;

                    case 3:
                        System.out.println("Exiting...");
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

    public static void checkOut(Guest guest) {
        System.out.println(goodByeInLanguages.get(guest.getPreferredLanguage()));
    }

    public static void checkIn(Guest guest) {
        System.out.println(welcomeInLanguages.get(guest.getPreferredLanguage()));
    }
}
