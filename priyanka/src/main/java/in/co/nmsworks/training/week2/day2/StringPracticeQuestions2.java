package in.co.nmsworks.training.week2.day2;

public class StringPracticeQuestions2 {
    public static void main(String[] args) {

        StringPracticeQuestions2 stringPractice  = new StringPracticeQuestions2();
        stringPractice.checkValidUsername("PriyankaKanagaraj");
        stringPractice.checkValidUsername("Pri");
        stringPractice.checkValidUsername("Priyanka");
        stringPractice.checkValidMailId("@nmsworks.co.in");
        stringPractice.hasWireless("this is wireless");
        stringPractice.couponCode(" SAVE10 ");
        stringPractice.couponCode("hello");
        stringPractice.displayInitials("University College of Engineering");
        stringPractice.decodePhoneNumber("9344683461");
    }

    public void checkValidUsername(String string){
        if(string.length()>=5 && string.length()<15){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }

    public void checkValidMailId(String input){
        if(input.contains("@")){
            String[] array = input.split("@");
            for(String string: array){
                System.out.println(string);
            }

            if(array.length !=2) {
                System.out.println("invalid !!");
            }

            if(array[1].equals("nmsworks.co.in")){
                System.out.println("Valid");
            }
            else{
                System.out.println("invalid");
            }
        }
        else{
            System.out.println("Invalid mailId");
        }

    }
    public void hasWireless(String string){
        if(string.contains("wireless")){
            System.out.println("contains wireless");
        }
        else{
            System.out.println("does not contains wireless");
        }
    }

    public void couponCode(String string){
        String coupon = string.trim();
        if("SAVE10".equals(coupon)){
            System.out.println("matched");
        }
        else{
            System.out.println("unmatched");
        }
    }

    public void displayInitials(String string){
        String[] words = string.split(" ");
        for(String initial: words){
            System.out.print(initial.charAt(0));
        }
    }

    public void decodePhoneNumber(String string){
        char[] arr = string.toCharArray();
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
