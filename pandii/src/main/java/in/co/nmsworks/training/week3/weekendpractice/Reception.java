package in.co.nmsworks.training.week3.weekendpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reception {
    Map<Integer,Guest> idToGuest=new HashMap<>();
    Scanner scanner=new Scanner(System.in);
    int id=101;

    public void registerGuest() {
        System.out.println("Give ur name :");
        String name=scanner.next();

        System.out.println("Give ur language :");
        String language=scanner.next();
        Language lang = null;

        if(language.equalsIgnoreCase("English"))
        {
            lang=new EnglishLanguage();
        } else if (language.equalsIgnoreCase("Tamil")) {
            lang=new TamilLanguage();
        }
        idToGuest.put(id,new Guest(id,name,lang));
        System.out.println("Guest Added Successfully!!");
        lang.welcome();
        System.out.println("Your id is : "+id);
        id++;
    }

    public void checkGuestExist()
    {
        System.out.println("Enter ur id : ");
        int id=scanner.nextInt();
        if(!idToGuest.containsKey(id))
        {
            System.out.println("Guest not found");
            return;
        }
        Guest guest=idToGuest.get(id);
        System.out.println("1.Check in");
        System.out.println("2.Check out");
        int choice=scanner.nextInt();
        if(choice==1)
        {
            guest.getLanguage().welcome();
        } else if (choice==2) {
            guest.getLanguage().thankyou();
        }
        else {
            System.out.println("Invalid Input");
        }
    }

}
