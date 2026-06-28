package in.co.nmsworks.training.week2.day2;

import org.apache.commons.lang3.ObjectUtils;

public class StringPractice {
    public static void main(String[] args)
    {
        StringPractice sp=new StringPractice();
        sp.checkUserNameValid("sps");
        sp.checkValidEmail("ssp@nmsworks.co.in");
        sp.checkWordDescription("the wireless");
        sp.trimCode(" save10 ");
//        sp.trimCode(null);
        sp.displayInitials("University College Engi");
        sp.censorPhoneNo("9888827083");
    }

    private void censorPhoneNo(String number) {
        if(number.length()!=10)
        {
            System.out.println("Invalid number");
            return;
        }
        else {
            System.out.println(number.substring(0, 2) + "XXXXXX" + number.substring(8));
        }
    }

    private void displayInitials(String name) {
        String word[]=name.split(" ");
        for (String s : word) {
            System.out.println((s.toUpperCase().charAt(0)));
        }
    }

    private void trimCode(String s) {
        String result=s.trim().toUpperCase();
        if("SAVE10".equals(result))
        {
            System.out.println("Matches");
        }
        else {
            System.out.println("Unmatched");
        }
    }

    private void checkWordDescription(String st) {
        if(st.toLowerCase().contains("wireless")){
            System.out.println("contains ");
        }
        else {
            System.out.println("not contains ");
        }

    }

    private void checkValidEmail(String s) {
//        if(s.endsWith("@nmsworks.co.in"))
//        {
//            System.out.println("correct email ");
//        }
//        else {
//            System.out.println("Invalid mail id");
//        }
        String arr[]=s.split("@");
        if(arr.length!=2)
        {
            System.out.println("Invalid email");
            return;
        }
        if(arr[1].equals("nmsworks.co.in")&& !arr[0].isEmpty())
        {
            System.out.println("Valid email");
        }
        else {
            System.out.println("Invalid email Id");
        }

    }

    private void checkUserNameValid(String str) {
        if(str.length() >= 5 && str.length() <= 15)
        {
            System.out.println("Valid username");
        }
        else {
            System.out.println("Invalid");
        }
    }



}
