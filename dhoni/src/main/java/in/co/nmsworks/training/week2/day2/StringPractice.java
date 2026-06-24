package in.co.nmsworks.training.week2.day2;

public class StringPractice {
    public static void main(String[] args) {
        StringPractice sp = new StringPractice();
//        String userName = "dhonikarthick";
//        sp.isValidUserName(userName);
//        String userEmail = "dhonikarthick@nmsworks.co.in";
//        sp.isValidGmailId(userEmail);
//        String description = "Sony wireless headphone";
//        sp.isContainsWireless(description);
//        String coupon = " SAVE10 ";
//        sp.isValidCoupon(coupon);
//        String customerName = "Sanjeev Kumar";
//        sp.displayInitials(customerName);
//        String college = "University College Engineering";
//        sp.displayInitials(college);
//        String phoneNumber = "9080262077";
//        sp.censorPhone(phoneNumber);

    }

    private void censorPhone(String phoneNumber) {

        String first = phoneNumber.substring(0,2);
        String last = phoneNumber.substring(8);
        String censoredNumber = first+"XXXXXX"+last;

        System.out.println("Censored Number : " + censoredNumber);
    }

    private void displayInitials(String customerName) {
        String[] words = customerName.split(" ");
        System.out.println("Name : " + customerName);
        System.out.print("Initials :  ");
        for(String word : words){
            System.out.print(word.charAt(0)+"".toUpperCase());
        }
        System.out.println();
    }

    private void isValidCoupon(String coupon) {
        if(coupon.trim().equals("SAVE10")){
            System.out.println("Is valid coupon : " + coupon.trim());
            return;
        }
        System.out.println("Is not valid coupon : " + coupon.trim());
    }

    private void isContainsWireless(String description) {
        if(description.toLowerCase().contains("wireless")){
            System.out.println("Is wireless product");
            return;
        }
        System.out.println("Is not a wireless product");
    }

    private void isValidUserName(String userName) {
        if(userName.length() < 5 || userName.length() > 15){
            System.out.println("Invalid User name : " +userName);
        }

        if(userName.contains("!@#$%^&*()_+-<>/`~")){
            System.out.println("Invalid User name : "+ userName);
        }

        System.out.println("Valid User name : " + userName);
    }

    private void isValidGmailId(String email){

        String[] words = email.split("@");

        if(words.length != 2){
            System.out.println("Invalid email : " + email);
            return;
        }

        if(!(words[0].length() > 10)){
            System.out.println("Invalid email : " + email);
            return;
        }

        if(!words[1].equals("nmsworks.co.in")){
            System.out.println("Invalid email : " + email);
            return;
        }
        System.out.println("Is valid email : "+ email);
    }



}
