package in.co.nmsworks.training.week3.weekend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReceptionist {
    public static void main(String[] args) {
        HotelReceptionist hotelReceptionist = new HotelReceptionist();
        List<Guest> guestList = new ArrayList<>();
        hotelReceptionist.acceptGuest(guestList);
    }

    private void acceptGuest(List<Guest> guestList) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            while (choice != 2) {
                System.out.println("1. Accept guest");
                System.out.println("2. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Guest name: ");
                        System.out.flush();
                        String name = scanner.next();
                        System.out.println("Enter preferred language (ENGLISH/HINDI/TAMIL): ");
                        System.out.flush();
                        Language preferredLanguage = Language.valueOf(scanner.next());
                        Guest guest = new Guest(name, preferredLanguage);
                        if (!guestList.contains(guest)) {
                            guestList.add(guest);
                            System.out.println("Guest added");
                        } else {

                            int index = guestList.indexOf(guest);
                            Guest existingGuest = guestList.get(index);
                            if (existingGuest.isCheckedIn()) {
                                existingGuest.checkOut();
                                guestList.remove(existingGuest);
                            } else {
                                existingGuest.checkIn();
                            }
                        }
                        System.out.println(guestList);

                        break;

                    case 2:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Choice " + choice);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
