package in.co.nmsworks.training.week2.day2;

import org.apache.commons.lang3.ObjectUtils;

public class StringManipulation2 {
    public static void main(String[] args) {

        StringManipulation2 sp1 = new StringManipulation2();
        sp1.nameValidator("anas mohamed");
        sp1.emailValidator("mohamedanas@nmsworks.co.in");
        sp1.containWireless("the connection is wireless");
        sp1.codeMatch("  SAVE10 ");
        //sp1.codeMatch(null);
        sp1.displayInitial("university colle engn");
        sp1.displayPhoneNum("9876543210");
    }

    private void displayPhoneNum(String num) {
        String result = "";

        String str = num.substring(0,2);
        result += str;
        for (int j = 2; j < num.length()-2 ; j++) {
            result += "x";
        }
        String str2 = num.substring( num.length()-2, num.length() );
        result += str2;
        System.out.println("coded phone number :: " + result);
    }

    private void displayInitial(String name) {
        String[] str = name.split(" ");
        String result = "";
        for (String txt : str){
            String ss = txt.substring(0,1).toUpperCase();
            result += ss;
        }
        System.out.println("initial: " + result);
    }

    private void nameValidator(String username){
        if(username.length() >=5 && username.length() <= 15){
            System.out.println("valid name");
        }
        else{
            System.out.println("invalid name");
        }
    }

    private void emailValidator(String email){
        if( email.endsWith("@nmsworks.co.in")){
            System.out.println("valid email");
        }
        else{
            System.out.println("invalid email");
        }

        /*String[] str = email.split("@");
        if (str.length != 2){
            System.out.println("invalid mail");
        }
        else if(str[1].equals("nmsworks.co.in")){
            System.out.println("valid mail");
        }
        else{
            System.out.println("invalid mail");
        }*/
    }

    private void containWireless(String txt){
        if( txt.contains("wireless")){
            System.out.println("description has wireless");
        }
        else{
            System.out.println("description doesnt have wireless");
        }
    }

    private void codeMatch(String code){
        String code1 = code.trim();
        if ( code1.equals("SAVE10")){
            System.out.println("code verified");
        }
        else{
            System.out.println("code not verified");
        }
    }
}
