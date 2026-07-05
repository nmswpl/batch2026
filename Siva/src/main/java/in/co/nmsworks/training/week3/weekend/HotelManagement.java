package in.co.nmsworks.training.week3.weekend;

import jdk.nashorn.internal.ir.SplitReturn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelManagement {
    public static void main(String[] args) {
        HotelManagement hm = new HotelManagement();
        hm.run();
    }

    private void run() {
        Map<String, Guest> guestDetails= new HashMap<>();
        int choice = 0;
        try (Scanner scanner = new Scanner(System.in)){
            while (choice != 3) {
                System.out.println("================ Welcome to Sk stays =================");
                System.out.println("Option 1 for Check-in");
                System.out.println("Option 2 for Check-Out");
                System.out.println("Option 3 for Exit");
                System.out.print("Enter your Choice :");
                choice = scanner.nextInt();
                System.out.println();
                switch (choice) {
                    case 1:
                        System.out.print("You have a Guest Id, Please Enter Your Guest ID. If not Please enter 'NIL'");
                        String id = scanner.next();
                        System.out.println();
                        if ("NIL".equalsIgnoreCase(id)) {
                            System.out.print("Enter your Name : ");
                            String name = scanner.next();
                            System.out.println("\n---------- Choose Prefered Language ----------");
                            System.out.println("Option A - Tamil\nOption B - English\nOption C - Hindi");
                            System.out.print("Enter your choice : ");
                            char ch = scanner.next().charAt(0);
                            System.out.println();
                            Language preferedLanguage;
                            if (ch == 'A') {
                                preferedLanguage = new Tamil();
                            }
                            else if (ch == 'B') {
                                preferedLanguage = new English();
                            }
                            else if (ch == 'C') {
                                preferedLanguage = new Hindi();
                            }
                            else {
                                System.out.println("Invalid Language Choice!!!");
                                break;
                            }
                            Guest guest = new Guest(name, preferedLanguage);
                            id = guest.getId();
                            guestDetails.put(guest.getId(), guest);
                        }
                        else {
                            if (!guestDetails.containsKey(id)){
                                System.out.println("PLease enter valid Guest Id!!");
                                break;
                            }
                        }
                        guestDetails.get(id).getPreferedLanguage().checkIn();
                        System.out.println(guestDetails.get(id));
                        break;
                    case 2:
                        System.out.print("Enter Your Guest ID : ");
                        id = scanner.next();
                        System.out.println();
                        if (!guestDetails.containsKey(id)) {
                            System.out.println("Enter valid Guest Id!!");
                            break;
                        }
                        guestDetails.get(id).getPreferedLanguage().checkOut();
                        System.out.println(guestDetails.get(id));
                        break;
                    case 3:
                        System.out.println("Thank You!!!!");
                        break;
                    default:
                        System.out.println("Please Enter Valid Choice!!!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
