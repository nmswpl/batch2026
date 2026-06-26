package in.co.nmsworks.training.week2.day2;

public class StringPractice2  {

    public static void main(String[] args) {

            StringPractice2 sp = new StringPractice2();
            sp.validUsername();
            sp.isValidEmail();
            sp.validDescription();
            sp.validCoupon();
            sp.displayInitials();
            sp.phNumber();
            //sp.validCustomer();


    }


    private void phNumber() {

        String str = " 9952253884";

        for(int i=0;i<str.length();i++) {


                if (i==0 || i==1 || i==str.length() || i == str.length()-1){
                    System.out.print(str.charAt(i));
                }
                else{
                    System.out.print("x");
                }


        }





    }


    private void displayInitials() {

        String fullName= "Madu Sakthi";

        String initials = "";

        String[] words = fullName.trim().split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                initials += word.charAt(0);
            }
        }


        System.out.println("Output: " + initials.toUpperCase());
    }

    private void validUsername() {

       String str = "MADUS";
       int a = str.length();

       if(a>=5 && a<15)
       {
           System.out.println("The username is valid "+ str);
       }
       else{
           System.out.println("The username is invalid "+str);
       }


   }

   private void isValidEmail() {

       String str = "manikandansakthi@nmsworks.co.in";

       String[] s = str.split("@");

       if(s.length!=2){
           System.out.println(s[0]+s[1]);
           System.out.println("The mail id invalid");
       }
       else  if(s[1].equals("nmsworks.co.in")){
           System.out.println(s[0]+" "+s[1]);
           System.out.println("The mail id valid");
       }

   }

   private void validDescription(){

        String str="wireless";
        String str1=str.toLowerCase();

        String[] st = str.split("");

        for(int i=0;i<st.length;i++) {
            System.out.println(st[i]);
        }

        if(str1.contains("wireless")){
            System.out.println("The product description has "+str);
        }
        else {
            System.out.println("The product description doesnt contains "+str);
        }
   }

   private void validCoupon()
   {
       String str= " save10";

       String str1=str.trim();

       if(str1.equalsIgnoreCase("SAVE10")){
           System.out.println(str1+ " Is valid coupon");
       }
   }


}
