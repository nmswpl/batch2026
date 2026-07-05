package in.co.nmsworks.training.week3.day6.hotel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelManagement {
    private Map<Integer,Guest> map;

    public HotelManagement() {
        this.map = new HashMap<>();
    }

    public void register(String name, String language){

        Guest guest = new Guest(name, language);
        int guestId = Math.abs(guest.hashCode());

        guest.setId(guestId);
        System.out.println("Registered successfully");
        System.out.println("Your guest ID : " + guestId);

        map.putIfAbsent(guestId,guest);
        System.out.println(map);
    }

    public void login(int id){
        Scanner scanner = new Scanner(System.in);
        if(map.containsKey(id)){

            System.out.println("Would like to CheckIn");
            System.out.println("Enter [Yes/No] : ");
            String line = scanner.nextLine();
            if("yes".equalsIgnoreCase(line)){
                checkIn(id);
            }

        }
        else {
            System.out.println("Wrong ID");
        }

        scanner.close();
    }

    public void checkIn(int id){

        if("tamil".equalsIgnoreCase(map.get(id).getLanguage())){
            System.out.println("Vanakkam, " + map.get(id).getName());
        }
        else if("english".equalsIgnoreCase(map.get(id).getLanguage())){
            System.out.println("Welcome, " + map.get(id).getName());
        }
        else if("hindi".equalsIgnoreCase(map.get(id).getLanguage())){
            System.out.println("Namaste, " + map.get(id).getName());
        }
        else {
            System.out.println(map.get(id).getLanguage() + " " + map.get(id).getName());
        }
        System.out.println("Get your key have good day");
    }

    void checkOut(int id){
        System.out.println("Thanks for visiting , " + map.get(id).getName());
        System.out.println("Visit us Again !");
    }


    public Map<Integer, Guest> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Guest> map) {
        this.map = map;
    }
}
