package in.co.nmsworks.training.week2.day2;

import java.util.Scanner;

public class StringPractice {

    Scanner scanner;
    public static void main(String[] args) {
        StringPractice sp = new StringPractice();
//        sp.userNameIsValidOrNot();
//        sp.emailIsValidOrNot();
//        sp.checkPresentOrNot();
//        sp.checkCouponIsValidOrNot(null);
//        sp.checkCouponIsValidOrNot("  SAVE10");
//        sp.printInitials("University Coll ENg");
//        sp.censorDigits("1234567890");

    }

    private void censorDigits(String number) {
        String answer = number.substring(0,2);
        int i;
        for (i = 2; i < number.length()-2; i++) {
            answer += 'X';
        }
        answer += number.substring(i);
        System.out.println(answer);
    }

    private void printInitials(String name) {
        String[] nameSplit = name.split(" ");
        String answer = "";
        for (String s : nameSplit) {
            answer += s.charAt(0);
        }
        System.out.println(answer);
    }

    private void checkCouponIsValidOrNot(String coupon) {
        if (coupon!=null && coupon.trim().equals("SAVE10"))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    private void checkPresentOrNot() {
        scanner = new Scanner(System.in);
        System.out.println("Enter any description");
        String des = scanner.nextLine();
        if (des.contains("wireless"))
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }

    private void emailIsValidOrNot() {
        scanner = new Scanner(System.in);
        System.out.println("Enter your Email");
        String email = scanner.nextLine();
        String[] emailArray = email.split("@");
        if (emailArray.length == 2) {
            if (emailArray[0].length() > 0 && emailArray[1].equals("@nmsworks.co.in"))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
        else
            System.out.println("Invalid");
//        if (email.length() > 15 && email.endsWith("@nmsworks.co.in"))
//            System.out.println("Email is Valid");
//        else
//            System.out.println("Email is Invalid");
    }

    private void userNameIsValidOrNot() {
        scanner = new Scanner(System.in);
        System.out.println("Enter your UserName");
        String userName = scanner.nextLine();
        if (userName.length() >= 5 && userName.length() <= 15)
            System.out.println("UserName is Valid");
        else
            System.out.println("UserName is Invalid");
    }

}
