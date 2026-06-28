package in.co.nmsworks.training.week2.day2;

public class StringPractice {
    public static void main(String[] args) {
        StringPractice sp = new StringPractice();
        sp.userNameCheck("Gobika");
        sp.checkEmailId("gobikas@nmsworks.co.in");
        sp.containsWord("product description");
        sp.extraSpace("  SAVE10 ");
        sp.extraSpace(null);
        sp.displayInitial("University College of Engineering");
        sp.encryptNumber("1234567890");
    }

    private void encryptNumber(String s) {
        System.out.println();
        String newNum = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < 2) {
                newNum += s.charAt(i);
            } else if ( i >= s.length()-2) {
                newNum += s.charAt(i);
            }
            else {
                newNum += "x";
            }
        }

        System.out.println(newNum);
    }

    private void displayInitial(String s) {
        String[] strArr = s.split(" ");
        for (String string : strArr) {
            System.out.print(string.charAt(0));
        }

    }

    private void extraSpace(String s) {
        if (s == null){
            System.out.println("Invalid input");
        }
        else {
            if ("SAVE10".equals(s.trim())){
                System.out.println("Contain code");
            }
            else {
                System.out.println("Code is not placed");
            }
        }
    }

    private void containsWord(String word) {
        if (word.contains("wireless")){
            System.out.println("Contains");
        }
        else {
            System.out.println("Not Contains");
        }

    }

    private void checkEmailId(String mail) {
//        if (mail.endsWith("@nmsworks.co.in")){
//            System.out.println("Valid");
//        }
//        else {
//            System.out.println("Invalid");
//        }

        String[] splitMail = mail.split("@");
        if (splitMail.length != 2){
            System.out.println("Invalid Email");
        }
        if (!splitMail[0].isEmpty() && splitMail[1] .equals("nmsworks.co.in")){
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
    }

    private void userNameCheck(String name ){

        if (name.length() >= 5 && name.length() <= 15){
            System.out.println("Valid Username");
        }
        else {
            System.out.println("Invalid Username");
        }
    }

}
