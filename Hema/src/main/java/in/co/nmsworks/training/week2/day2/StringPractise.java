package in.co.nmsworks.training.week2.day2;

import java.util.*;

public class StringPractise {
    public static void main(String[] args) {
        StringPractise sp = new StringPractise();
        sp.checkValidUser("Hema");
        sp.checkValidEmail("hemabr@nmsworks.co.in");
        sp.hasWord("It is wireless!");
        sp.checkCoupenMatch("SAVE10");
        sp.checkCoupenMatch("null");
        sp.displayInitials("University College Engineering");
        sp.censorPhoneNumber("9876543210");
    }

    private void censorPhoneNumber(String number) {
        String censored = "";
        if(number.length()!=10)
        {
            System.out.println("Invalid Phone Number");
            return;
        }

        censored = censored + number.substring(0,2) + "xxxxxxxx" + number.substring(8);

        System.out.println(censored);


    }

    private void displayInitials(String name) {
        String[] temp = name.split(" ");
        String result = "";
        for (String s : temp) {
            result = result + s.charAt(0);
        }
        System.out.println(result);
    }

    private void checkCoupenMatch(String coupon) {
        if( "SAVE10".equals(coupon.trim()))
            System.out.println("Coupon Matches");
        else
            System.out.println("Coupon Not matches");
    }

    private void hasWord(String description) {
        if( description.contains("wireless") )
            System.out.println("Present");
        else
            System.out.println("Not present");

    }

    private void checkValidEmail(String email) {
        method2(email);
        method1(email);
    }

    private static void method2(String email) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if(email.endsWith("@nmsworks.co.in") && email.length()>15 && alphabet.contains(email.substring(0,1)))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    private static void method1(String email) {
        String[] temp = email.split("@");
        if(temp[0].length()!=0 && (temp.length == 2))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    private void checkValidUser(String userName) {
        if(userName.length()>5 && userName.length()<=15)
            System.out.println("Valid");
        else
        {
            System.out.println("Invalid");
        }
    }


}
