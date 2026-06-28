package in.co.nmsworks.training.week2.day2;

public class StringPractice {
    public static void main(String[] args) {
        StringPractice sp = new StringPractice();
        sp.checkValidUsername("MohamedFarhaan");
        sp.checkValidMailId("farhaan@nmsworks.co.in@farhaan");
        sp.checkWirelessInSentence("Zebronics Wireless Mouse, Dual Mode 2.4GHz + BT, Up to 1600 DPI, USB Nano Receiver, Lightweight Design, Multicolor LED Lights, Rechargeable Battery (Blanc, Grey)");
        sp.verifyCouponCode("SAVE 10");
        sp.displayInitials("University College Engineering");
        sp.censoringPhoneNumber("6380946003");
    }

    private void censoringPhoneNumber(String number) {
        if(number.length()>10){
            System.out.println("Invalid Number");
        }
        System.out.println(number.substring(0,2) + "XXXXXX" + number.substring(8));
    }

    private void displayInitials(String name) {
        String[] array = name.split(" ");
        for(String str : array){
            System.out.print(str.charAt(0));
        }
    }

    private void verifyCouponCode(String inputString) {
        if(inputString.trim().equals("SAVE10")){
            System.out.println("Valid Coupon");
        }
        else{
            System.out.println("Invalid Coupon");
        }
    }

    private void checkWirelessInSentence(String inputString) {
        String lowerCaseString = inputString.toLowerCase();
        if(lowerCaseString.contains("wireless")){
            System.out.println("The Description Contains The Word wireless");
        }
        else{
            System.out.println("The Description Does Not Contains The Word wireless");
        }
    }

    private void checkValidMailId(String inputString) {
        String[] array = inputString.split("@");
        if(array.length>2 && array[1] != "nmsworks.co.in"){
            System.out.println("The Mail Id is Invalid");
        }
        else{
            System.out.println("The Mail Id is Valid");
        }
    }

    private void checkValidUsername(String inputString) {
        if(inputString.length() <= 15 && inputString.length() >= 5){
            System.out.println("The username is valid");
        }
        else{
            System.out.println("The username is inavlid");
        }
    }


}
