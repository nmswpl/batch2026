package in.co.nmsworks.training.week3.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Receptionist {


    Map<Integer, Guest> map = new LinkedHashMap<>();


    public void registerGuest(int id, String name, Language prefLang) {
        Guest guest = new Guest(id, name, prefLang);
        if (!(map.containsKey(guest.getGuestID()))) {
            map.putIfAbsent(id, guest);
            System.out.println("Guest  " + name + "registered!");
            System.out.println("Guest ID : " + id);
            id++;
        }
        else {
            System.out.println("registered already");

        }
    }

    public void checkIN(int id){
        Guest guest = map.get(id);
        if((map.get(id) != null)){
            guest.getPrefLang().welcome(guest.getName());
        }
    }


    public void checkOUT(int id) {
        Guest guest = map.get(id);
        if ((map.get(id) != null)) {
            guest.getPrefLang().thankYou(guest.getName());

        }
    }


    public static void main(String[] args) {

        Receptionist receptionist = new Receptionist();

        Language english = new English();
        Language tamil =new Tamil();
        Language hindi = new Hindi();
        receptionist.registerGuest(1, "Mohana", english);
        receptionist.registerGuest(2, "Deva", tamil);
        receptionist.registerGuest(1,"helo",hindi);
        receptionist.checkIN(1);
        receptionist.checkOUT(1);

    }
}