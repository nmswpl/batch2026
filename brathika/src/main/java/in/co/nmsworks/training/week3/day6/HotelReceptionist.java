package in.co.nmsworks.training.week3.day6;

import java.util.*;

public class HotelReceptionist {
    static  Map<String, Language> langauage = new HashMap<>();
    static List<Guest> guests = new ArrayList<>();
    public static void main(String[] args) {
        HotelReceptionist hotel = new HotelReceptionist();

        langauage.put("english", new Engilsh());
        langauage.put("tamil",new Tamil());
        langauage.put("hindi",new Hindi());
        try (Scanner sc = new Scanner(System.in)){
            int guestCount = 0;
            int choice = 0;
            while (choice != 3 ) {
                System.out.println("1. new user");
                System.out.println("2. Existing user");
                System.out.println("3. exit");
                System.out.println("Enter your user type");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Enter your name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Language available are: "+langauage.keySet());
                    System.out.println("Can you enter your prefered langauage");
                    String preferedLanguage = sc.nextLine();
                    preferedLanguage = preferedLanguage.toLowerCase();
                    guestCount++;
                    String id = "Guest"+guestCount;
                    Guest guest = new Guest(id,name,preferedLanguage);
                    System.out.println(guest);
                    guests.add(guest);
                    hotel.processVisitType(guest , "checkin");
                    hotel.processVisitType(guest,"Checkout");
                }
                else if (choice == 2) {
                    Guest guest = new Guest();
                    System.out.println("Enter your guest id: ");
                    sc.nextLine();
                    String id = sc.nextLine();
                    boolean isFound = false;
                    for (Guest guest1 : guests) {
                        if (guest1.getId().equals(id)) {
                            System.out.println(guest1);
                            isFound = true;
                            hotel.processVisitType(guest1,"Checkin");
                            hotel.processVisitType(guest1,"checkout");
                        }
                    }
                    if (!isFound) {
                        System.out.println("Guest not found can you give the correct guest id");
                    }
                }
                else {
                    System.out.println("Thank you for using our system");
                }
            }
        }

    }
    public void processVisitType(Guest guest, String visitType) {
        Language lang = langauage.get(guest.getPreferedLanguage());
        if (lang == null) {
            lang = langauage.get("English");
        }
        if ("checkin".equalsIgnoreCase(visitType)) {
            System.out.println(lang.checkInMessage(guest.getName()));
        }
        else if ("checkout".equalsIgnoreCase(visitType)) {
            System.out.println(lang.checkOutMessage(guest.getName()));
        }

    }
}