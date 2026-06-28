package in.co.nmsworks.training.week2practices;

public class Pattern {

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
    }

    private static void pattern5() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<= 2 *i - 1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void pattern4() {
        for(int i=0;i<7;i++){
            char ch = (char)('A'+i);
            for(int j=0;j<=i;j++){

                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    private static void pattern3() {
        for (int i = 1; i < 7; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        System.out.println("______________");
    }

    private static void pattern2() {
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println(" ");
        }
        System.out.println("______________");
    }

    private static void pattern1() {
        int n=7;
        for (int i = 1; i <=n ; i++) {

          for(int j=1;j<=i;j++){
              System.out.print(j);
          }
            System.out.println(" ");
        }
        System.out.println("______________");
    }
}
