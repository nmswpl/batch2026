package in.co.nmsworks.training.week2.Day5;

public class Pattern {

    public void RightTriangle(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=(i+1); j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    public void InvertedRightTriangle(){
        int n=5;
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    public void LeftAlignedTriangle(){
        int n=7;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0; j--) {
                if(i>=j) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void InvertedLeftAlignedTriangle(){
        int n=5;
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j<=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public void FullPyramid(){
        int n=6;
        for (int i = 1 ;i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
