package in.co.nmsworks.training.week2.day5;

public class Pattern {
    public static void main(String[] args) {
        rightAngle();
        System.out.println("----");
        invertedRightTriangle();
        System.out.println("----");
        leftlignedTriangle();
        System.out.println("----");
        invertedLeftAlignedTriangle();
        System.out.println("----");
        fullPyramid();
    }

    public static void fullPyramid() {
        int n = 7;
        int space = n-1;
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space;j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");

            }
            System.out.println();
            star += 2;
            space --;

        }
    }

    public static void invertedLeftAlignedTriangle() {
        int n = 7;
        int space = 0;
        int star = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");

            }
            System.out.println();
            space++;star--;

        }

    }

    public static void  rightAngle(){
        int n = 7;
        int space = 0;
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star++;

        }

    }

    public static  void invertedRightTriangle(){
        int n = 7;
        int space = 0;
        int star = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star--;

        }
    }

    public static void leftlignedTriangle(){
        int n = 7;
        int space = n-1;
        int star = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star++;space--;

        }

    }

}
