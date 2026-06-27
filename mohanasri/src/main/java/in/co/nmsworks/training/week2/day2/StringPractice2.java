package in.co.nmsworks.training.week2.day2;

import in.co.nmsworks.training.week2.day1.StringPractice;

public class StringPractice2 {
    public static void main(String[] args) {

        StringPractice2 sp = new StringPractice2();
        sp.usernameValidity("mohana");
        sp.emailIdValidity("mohanasri@nmsworks.co.in");
        sp.searchWord("wireless network");
        sp.validCoupon("SAVE10 ");
//        sp.validCoupon(null);
        sp.displayInitial("Mohana Sri S");
        sp.censorPh("9746578321");

    }





    void  censorPh(String number) {

            if (number == null || number.length() <= 4) {
                System.out.println(number);
                return;
            }
            char[] ch = number.toCharArray();
            for (int i = 2; i < ch.length - 2; i++) {
                ch[i] = 'X';
            }
            System.out.println(new String(ch));
        }


    void displayInitial(String str) {
        String[] sp = str.split(" ");
        for (String s : sp) {
            System.out.print(s.charAt(0));
        }
        System.out.println();
    }

   void validCoupon(String s) {
       s.trim();
        if ("SAVE10".equals(s)) {
            System.out.println("valid");
        } else {
            System.out.println("invaid");
        }
    }

    void searchWord(String str) {
        if (str.contains("wireless")) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }
    }

    public void emailIdValidity(String mail) {
        String[] split = mail.split("@");
//        System.out.println(split[0]);
//        System.out.println(split[1]);
        if (split.length != 2) {
            System.out.println("invalid");
        }
        if (split[0].length() > 6 && split[0].length() < 16) {
            if (split[1].equals("nmsworks.co.in")) {
                System.out.println("valid");

            }


    }
}
//        if (mail.endsWith("@nmsworks.co.in")){
//            System.out.println(" valid");
//        }
//        else{
//            System.out.println("invalid");
//        }


        public void usernameValidity (String str){
            if (str.length() > 6 && str.length() < 16) {
                System.out.println(" valid username");
            } else {
                System.out.println("Invalid username");
            }
        }

}


