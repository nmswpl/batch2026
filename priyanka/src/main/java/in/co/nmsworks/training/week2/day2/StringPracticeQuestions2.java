package in.co.nmsworks.training.week2.day2;

public class StringPracticeQuestions2 {
    public static void main(String[] args) {
        StringPracticeQuestions2 sp = new StringPracticeQuestions2();
//        sp.checkValidUsername("PriyankaKanagaraj");
//        sp.checkValidUsername("Pri");
//        sp.checkValidUsername("Priyanka");
//        sp.checkValidMailId("@nmsworks.co.in");
//        sp.hasWireless("this is wireless");
//        sp.couponCode(" SAVE10 ");
//        sp.couponCode("hello");
//        sp.displayInitials("University College of Engineering");
//        sp.decodePhoneNumber("9344683461");


    }
    public void checkValidUsername(String str){
        if(str.length()>=5 && str.length()<15){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }

    public void checkValidMailId(String str){
//        if(str.endsWith("@nmsworks.co.in")){
//            System.out.println("valid");
//        }
//        else{
//            System.out.println("invalid");
//        }
        String[] arr=str.split("@");
        for(String string:arr){
            System.out.println(string);
        }

        if(arr.length !=2) {
            System.out.println("invalid !!");
        }
//        if(arr[0].equals("")){
//            System.out.println("invalid");
//        }
        if(arr[1].equals("nmsworks.co.in")){
            System.out.println("Valid");
        }
        else{
            System.out.println("invalid");
        }


    }
    public void hasWireless(String str){
        if(str.contains("wireless")){
            System.out.println("contains wireless");
        }
        else{
            System.out.println("does not contains wireless");
        }
    }

    public void couponCode(String str){
        String coupon = str.trim();
        if("SAVE10".equals(coupon)){
            System.out.println("matched");
        }
        else{
            System.out.println("unmatched");
        }
    }

    public void displayInitials(String str){
        String[] words = str.split(" ");
        for(String initial: words){
            System.out.print(initial.charAt(0));
        }
    }

    public void decodePhoneNumber(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(i==0 || i==1 || i==8 || i==9){
                System.out.print(arr[i]);
            }
            else{
                System.out.print("x");
            }
        }
    }



}
