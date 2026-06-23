package in.co.nmsworks.training.week2.Day2;

public class StringPractice2 {
    public static void main(String[] args) {
        StringPractice2 sp=new StringPractice2();
        sp.userNameValiator("vetri");
        sp.emailValidator("vetriselvan@nmsworks.co.in@");
        sp.containWord("hi im wireless","wireless");
        sp.couponValiadtor(" SAVE10 ");
        sp.initialFinder("university colege of engineering tindivanam");
        sp.phoneNumberEncoder("9843482247");

    }

    private void phoneNumberEncoder(String phNumber) {
        String first =phNumber.substring(2,8);

        String p=phNumber.replace(first,"XXXXXXXX");

        System.out.println(p);

    }

    private void initialFinder(String name) {
        String[] n=name.split( " ");
        String initial="";
        for (String i:n) {
            String s=i.substring(0,1).toUpperCase();
            initial+=s;
        }
        System.out.println(initial);
    }

    private void couponValiadtor(String coupon) {
        String sp=coupon.trim();
        boolean co=sp.equals("SAVE10");
        System.out.println("Is The Coupon Valid:"+co);
    }

    private void containWord(String word,String target) {
        boolean w=word.contains(target);
        if (w==true){
            System.out.println("The description has the word "+target);
        }
        else {
            System.out.println("NO");
        }
    }

    private void emailValidator(String email) {
        String[] mailsp=email.split("@");
        if (mailsp.length==2 && mailsp[1].endsWith("nmsworks.co.in") && mailsp[1].length()<=14){
            System.out.println("Valid mails");
        }
        else {
            System.out.println("Invalid Email");
        }

    }


    private void userNameValiator(String username) {
        if (username.length()>=5 && username.length()<=15){
            System.out.println("Valid username");
        }
        else {
            System.out.println("Invalid Username");
        }
    }

}
