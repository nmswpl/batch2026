package in.co.nmsworks.training.week2.day2;

public class StringPractice {
    public static void main(String[] args) {
        StringPractice sp = new StringPractice();
        sp.findValid("username");
        sp.checkEmail("dgabriella@nmsworks.co.in");
        sp.checkEmailSplit("dgabriella@nmsworks.co.in");
        sp.checkWireless("This product is wireless");
        sp.checkCode("  SAVE10  ");
        sp.printInitials("University College Engineering");
        sp.censorNumber("1234567890");

    }

    // 1. Check validity of username
    public void findValid(String username){
        int size = username.length();
        if (5 <= size && size <= 15){
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }

    // 2.Check validity of email id
    public void checkEmail(String email){
        if (email.endsWith("@nmsworks.co.in")){
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }

    public void checkEmailSplit(String email){
        String[] splitArr = email.split("@");
        if (splitArr.length != 2){
            System.out.println("Invalid email");
        } else {
            if (splitArr[0].isEmpty()){
                System.out.println("Invalid email");
            } else if (splitArr[1] != "nmsworks.co.in"){
                System.out.println("Invalid email");
            } else {
                System.out.println("Valid email");
            }
        }
    }

    // 3. Check wireless is contained or not
    public void checkWireless(String description){
        if (description.toLowerCase().contains("wireless")){
            System.out.println("Contains wireless");
        } else{
            System.out.println("Does not contain wireless");
        }
    }

    // 4. Coupon code check
    public void checkCode(String code){
        String removeSpaces = code.trim();
        if (removeSpaces.equals("SAVE10")) {
            System.out.println("Code matched");
        } else {
            System.out.println("Code not matched");
        }
    }

    // 5. Print initials
    public void printInitials(String name){
        String[] splitName = name.split(" ");
        String initials = "";
        for (String s : splitName) {
            initials += s.charAt(0);

        }
        System.out.println("Initials: " + initials);
    }

    // 6, Replace digits
    public void censorNumber(String phno){
        String censored = "";
        for (int i = 0; i < 10; i++){
            if (i == 0 || i == 1 || i == 8 || i == 9){
                censored += phno.charAt(i);
            } else {
                censored += "*";
            }
        }
        System.out.println("Censored number: " + censored);
    }
}
