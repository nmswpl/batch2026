package in.co.nmsworks.training.week2.day2;

public class StringPractice {
    public static void main(String[] args) {
        StringPractice sp = new StringPractice();
        sp.validateUserName("Jemuna");
        sp.validateEmailId("jemunau@nmsworks.co.in");
        sp.dynamicEmailValidation("jemunau@nmsworks.co.in");
        sp.checkProductDescription("wireless");
        sp.couponCodeValidation(" SAVE10");
        sp.printInitials("Sanjeev Kumar");
        sp.printPhoneNumber("8778621234");
        System.out.println(" ");



    }


    private void printPhoneNumber(String number) {
        String a;
        a=number.substring(0,2)+"XXXXXX"+number.substring(8);
        System.out.println(" ");
        System.out.printf(a);

    }

    private void printInitials(String name) {
        String[] input = name.split(" ");
        for (int i = 0; i < input.length; i++) {
            String ans = input[i].toUpperCase();
            System.out.print(" "+ ans.charAt(0));
        }


    }

    private void couponCodeValidation(String input) {
        if("SAVE10".equals(input.trim())){
            System.out.println("Valid Coupon");
        }
        else{
            System.out.println("invalid Coupon");
        }
    }

    private void checkProductDescription(String target) {
        String s="Bluetooth is a wireless device";
        if(s.contains(target)){
            System.out.println("Product description has the word");
        }
        else{
            System.out.println("Product description doesnot have the word");
        }
    }

    private void dynamicEmailValidation(String mail) {
        String[] valid=mail.split("@");
        if(valid.length !=0){
            if(valid[1].equals("nmsworks.co.in"))
            System.out.println("Valid Email Id");
        }
        else{
            System.out.println("Invalid Email ID");
        }

    }

    private static void validateEmailId(String email) {
        String valid="@nmsworks.co.in";
        if(email.endsWith(valid)){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
    }

    private static void validateUserName(String user) {
        if(user.length()>5 && user.length()<15){
            System.out.println("Valid User");
        }
        else{
            System.out.println("Invalid user");
        }
    }



}



