package in.co.nmsworks.training.week2.Day1.Day2;

public class StringPractice2 {
    public void checkUserName(String name) {
        if (name.length() > 5 && name.length() < 15) {
            System.out.println("The Username is valid");
        } else {
            System.out.println("The Username not valid");
        }
    }

    public void checkValidEmail(String name) {
        String[] emailid = name.split("@");
        if (emailid.length == 2) {
            if (emailid[1].contains("@nmsworks.co.in")) {
                System.out.println("The email id is valid");
            } else {
                System.out.println("The email is invalid");
            }
        }
    }

    //Write a program to check whether a product description has the word "wireless".
    public void checkValidDesc(String description) {
        String name = description.toLowerCase();
        if (description.contains("wireless")) {
            System.out.println("Yes it contains");
        }
        else{
                System.out.println("not contains");
            }
        }

    //4. coupon code entered by a user may contain extra spaces before or after it. Verify whether the entered code matches "SAVE10".
public void checkCouponCode(String value) {
        try {
            String code = value.trim();
            if (code.equalsIgnoreCase("SAVE10")) {
                System.out.println("Yes it is valid");
            } else {
                System.out.println("Coupon is Not Valid");
            }
        }
        catch (Exception e){
            System.out.println("Null pointer Exception");
        }
    }
    //5. Given a customer's first name and last name, display their initials.
    //    E.g "Sanjeev Kumar" o/p :  SK
    public void printInitial(String name) {
        String[] value = name.split(" ");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i].charAt(0) + "");
        }
    }
    public void changeDigits(String name){
        String first=name.substring(0,2);
        String last=name.substring(8,10);
        String na="XXXXXX";
        System.out.println(first+na+last);
    }
    //A banking application stores customer details using customer ID and customer name. Two customers should be treated as the same customer if their IDs are equal. Write a program to compare two customer records.
    //


        public static void main (String[]args){
            StringPractice2 s1 = new StringPractice2();
           // s1.checkUserName("sound");
           // s1.checkValidEmail("@nmsworks.co.inabc");
           // s1.checkValidDesc("Apple buds is wireless");
            s1.checkCouponCode(null);
            s1.printInitial("university college eng");
            s1.changeDigits("9600817177");
        }
        }




