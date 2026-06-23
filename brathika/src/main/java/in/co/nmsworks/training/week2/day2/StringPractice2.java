package in.co.nmsworks.training.week2.day2;

public class StringPractice2 {
    public static void main(String[] args) {
        StringPractice2 sp = new StringPractice2();
        sp.checkValidUsername("Brathika");
        sp.checkValidEmail("@nmsworks.co.insanjeev");
        sp.checkForProducrDescription("product is");
        sp.verifyCouponCode("  SAVE10   ");
        sp.printInitial("Univer call engine");
        sp.displayCensoredPhoneNumber("7603999862");
    }

    private void displayCensoredPhoneNumber(String number) {
        String answer = "";
        for (int i = 0; i < number.length(); i++) {
            if (i < 2) {
                answer += number.charAt(i);
            } else if (i >= number.length() - 2) {
                answer += number.charAt(i);
            }else {
                answer += "X";
            }
        }
        System.out.println("The number is: "+answer);
    }

    private void printInitial(String string1) {
        String[] array = string1.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].charAt(0));
        }
        System.out.println();
    }

    private void verifyCouponCode(String s) {
        String answer = s.trim();
        if("SAVE10".equals(answer)){
            System.out.println("It is vaid coupon");
        }
        else {
            System.out.println("It is not a valid coupon");
        }
    }

    private void checkForProducrDescription(String productIsWireless) {
        if (productIsWireless.toLowerCase().contains("wireless")) {
            System.out.println("Product description does have wireless word");
        }
        else {
            System.out.println("Product does not have wireless word");
        }
    }

    private void checkValidEmail(String mail) {
        String[] array = mail.split("@");
        if (array.length != 2) {
            System.out.println(mail+" is not a valid email");
        }
        else if(!array[0].isEmpty() && array[1].equals("@nmsworks.co.in")) {
            System.out.println(mail+" is a valid email");;
        }
        else {
            System.out.println(mail+" is not valid email");
        }
    }

    private void checkValidUsername(String name) {
        int n = name.length();
        if (n > 5 && n < 15) {
            System.out.println(name+" is a valid username");
        }
        else {
            System.out.println(name+" is not valid username");
        }
    }
}
