package in.co.nmsworks.training.week2.day2;

public class StringPractice {
    public static void main(String[] args){
        StringPractice sp=new StringPractice();
        System.out.print("check the username : ");
        String username="Anushri";
        sp.checkValid(username);
//        String email="anushrithayuman@gmail.com";
        String email="anushri@nmsworks.co.in";
        System.out.print("check the email : ");
        sp.checkmail(email);

        System.out.print("product details : ");
        String product="wifi is a  wireless";
        sp.checkwirelessproduct(product);

        System.out.print("coupon code : ");
        String match=" SAVE10  ";
        sp.checkCoupon(match);
//        sp.checkCoupon(null);

        System.out.print("display name : ");
        String name="Madras Institute of Technology";
        sp.displayName(name);
        System.out.println();
        System.out.print("display phone : ");
        String phone="9087806234";
        sp.displayPhone(phone);

    }

    private  void displayPhone(String phone) {
        String r=phone.substring(0,2)+"XXXXXX"+phone.substring(8);
        System.out.println(r);
    }

    private void displayName(String name) {
        String[] res = name.split(" ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i].charAt(0));
        }

    }

    private void checkCoupon(String match) {
        if("SAVE10".equals(match.trim())){
            System.out.println("valid");
        }
        else{
            System.out.println("in valid");
        }
    }

    private  void checkwirelessproduct(String product) {
        if(product.contains("wireless")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    private  void checkmail(String email) {
        String[] arr=email.split("@");
        if ((arr[0].length()!=0) && (arr.length==2) &&(arr[1].equals("nmsworks.co.in"))) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    private void checkValid(String username) {
        if(username.length()>5 && username.length()<=15){
            System.out.println("valid");
        }
        else{
            System.out.println("in valid");
        }
    }
}
