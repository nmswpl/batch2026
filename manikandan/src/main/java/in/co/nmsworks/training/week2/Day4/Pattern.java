package in.co.nmsworks.training.week2.Day4;

public class Pattern {

    public static void main(String[] args) {
        RightAngle();
        InvertedRightAngle();
        LeftAngleTriangle();
        InvertedLeftAngleTriangle();
        Pyramid();
    }


    public static void  RightAngle(){
        int n=7;
        System.out.println("Right angle Triangle ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------");
    }
    public static void InvertedRightAngle(){

        System.out.println("INVERTED RIGHT ANGLE TRAINGLE ");
        int n=7;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("---------------------");
    }
    public static void LeftAngleTriangle(){
        System.out.println("LEFT ANGLE TRIANGLE ");
        int n=7;
        for(int i=1;i<=n;i++){

            for(int j=1; j<=n-i ;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------");


    }
    public static void InvertedLeftAngleTriangle(){
        System.out.println("INVERTED LEFT ANGLE TRIANGLE ");
        int n=7;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }
    public static void Pyramid(){
        System.out.println("PYRAMID ");
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=2*(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
