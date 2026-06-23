package in.co.nmsworks.training.week2.day2;

public class StringPractice {
    public static void main(String[] args) {
        StringPractice sp = new StringPractice();

        sp.checkUsernameValid("KowshikSenthilMurugan");
        sp.checkValidEmail("kowshik@nmsworks.co.in@");

        sp.checkCouponCodeMatches("SAVE10");
        sp.checkCouponCodeMatches(null);
        sp.displayInitials("University college engg");

        sp.censorMobileNumber("9629588199");


    }

    private void checkUsernameValid(String username) {
        if (username.length() >= 5 && username.length() <= 15) {
            System.out.println("Username Valid");
        } else {
            System.out.println("Invalid Username");
        }
    }

    private void checkValidEmail(String email) {
        System.out.println("input : " + email);
        String[] arr = email.split("@");

        System.out.println("Length = " + arr.length);

        if (arr.length == 2 && arr[1].equals("nmsworks.co.in")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    private void isValidProductDescription(String productDesc) {
        if (productDesc.contains("wireless")) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }

    private void checkCouponCodeMatches(String couponCode) {
        if (couponCode == null) {
            System.out.println("Invalid input");
        } else {
            if (couponCode.trim().equals("SAVE10")) {
                System.out.println("Valid Coupon code");
            } else {
                System.out.println("Not valid");
            }
        }
    }

    private void displayInitials(String customerName) {
        String[] words = customerName.split(" ");

        for (String word : words) {
            System.out.print(word.charAt(0));
        }
    }

    private void censorMobileNumber(String mobNum) {
        String s1 = mobNum.substring(0, 2);
        String s2 = mobNum.substring(mobNum.length() - 2);

        System.out.print(s1);
        for (int i = 0; i < mobNum.length() - 4; i++) {
            System.out.print("x");
        }
        System.out.print(s2);
    }



}

