package in.co.nmsworks.training.week2.day2;

public class StringPractise {

    public static void main(String[] args) {
        StringPractise sp = new StringPractise();

        sp.checkUsername("Amizhthini");
        sp.checkEmailId("mangalayazhini@nmsworks.co.in");
        sp.checkWord("The product has a wireless charger" , "wireless");
        sp.checkCouponCode("  SAVE10");
        sp.printInitials("university college of engineering");
        sp.displayPhoneNo("9488013847");




    }

    /** Display phone no with privacy */
    public void displayPhoneNo(String ph) {
        for (int i = 0; i < 10; i++) {
            if(i < 2){
                System.out.print(ph.charAt(i));
            }
            else if(i <= 7){
                System.out.print("X");
            }
            else{
                System.out.print(ph.charAt(i));
            }

        }
    }

    /** Print the initals of the customer name */
    public void printInitials(String name) {
        String[] nameArr = name.split(" ");

        String str ;

        for (int i = 0; i < nameArr.length; i++) {
            str = nameArr[i].toUpperCase() ;
            System.out.print( " " + str.charAt(0) );
        }
        System.out.println();

    }

    /** Check if the coupon code is matching the correct code */
    public void checkCouponCode (String coupon){

        if(coupon != null){
            if ("SAVE10".equals(coupon.trim())){
                System.out.println("Valid Coupon Code");
            }
            else{
                System.out.println("Invalid Coupon Code");
            }
        }

    }


    /** Check if a particular word is present in the passage */
    public void checkWord(String passage, String word) {
        if (passage.contains(word)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }


    /** Check email id*/
    public void checkEmailId(String emailId) {
        // mangalayazhini@nmsworks.co.in
        String[] strArr = emailId.split("@");
        if(strArr.length != 0){
            if((strArr[0].length() >0) && (strArr[1].equals("nmsworks.co.in"))){
                System.out.println("Valid email ID");
            }

        }
        else{
            System.out.println("Invalid email ID");
        }

    }

    /** Check username*/
    public void checkUsername(String username) {
        if(username.length() > 5 && username.length() < 15){
            System.out.println("Valid Username");
        }
        else{
            System.out.println("Invalid Username");
        }
    }
}


