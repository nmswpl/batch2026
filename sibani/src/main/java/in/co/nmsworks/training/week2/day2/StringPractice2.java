package in.co.nmsworks.training.week2.day2;

public class StringPractice2 {
    public static void main(String[] args) {
        StringPractice2 sp = new StringPractice2();
        String usrName= "sibani";
        sp.checkUsernameValid(usrName);
        String email = "@nmsworks.co.insanjeev";
        sp.checkValidEmail(email);
        String prodDesc = "wirelessProduct";
        System.out.println("Contains Wireless : " + sp.checkContainsWireless(prodDesc));
        String coupon = "SAVE10";
        System.out.println("Valid Coupon : " + sp.checkValidCode(coupon));
        //sp.checkValidCode(null);
        String name = "University College of Engineering";
        sp.displayInitials(name);
        System.out.println();
        String number = "9876543210";
        sp.hideNumber(number);

    }

    private void hideNumber(String number) {
        if (number.length() != 10){
            System.out.println("Invalid Number");
        }
        else {
            System.out.println(number.substring(0, 2) + "XXXXXXXX" + number.substring(8));
        }
    }

    private void displayInitials(String name) {
        String[] name1 = name.split(" ");
        for (int i = 0; i < name1.length; i++) {
            char ch = name1[i].charAt(0);
            System.out.print(ch + "");
        }

    }

    private boolean checkValidCode(String coupon) {
        String trimmed = coupon.trim();
        if ("SAVE10".equals(trimmed)) {
            return true;
        }
        else {
            return false;
        }

    }

    private boolean checkContainsWireless(String prodDesc) {

        if (prodDesc.contains("wireless")){
            return true;
        }
        else {
            return false;
        }
    }

    private void checkValidEmail(String email) {
        /*if (email.length() > 15) {
            if (email.endsWith("@nmsworks.co.in")) {
                System.out.println("Valid NMS User");
            } else {
                System.out.println("Invalid NMS User");
            }
        } */
        String[] s = email.split("@");
        if (s.length != 2){
            System.out.println("Invalid NMS User");
        }
        else if (s[1].equals("nmsworks.co.in")) {
            System.out.println("Valid NMS User");
        }
        else {
            System.out.println("Invalid NMS User");
        }
    }

    private void checkUsernameValid(String usrName) {
        if(usrName.length()>=5 && usrName.length()<=15){
            System.out.println("Valid User name");
        }
        else {
            System.out.println("Invalid User Name");
        }
    }

}
