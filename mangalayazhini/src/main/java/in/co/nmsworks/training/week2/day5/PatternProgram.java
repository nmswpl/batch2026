package in.co.nmsworks.training.week2.day5;

public class PatternProgram {
    public static void main(String[] args) {
        PatternProgram obj = new PatternProgram();

        obj.rightTrianglePattern(8);

        obj.invertedRightTrianglePattern(8);

        obj.leftAlignedTrianglePattern(8);

        obj.invertedLeftAlignedTrianglePattern(8);
    }



    public void rightTrianglePattern(int n){
        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    private void invertedRightTrianglePattern(int n) {
        System.out.println("\nInverted Right Triangle Pattern:");
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }


    public void leftAlignedTrianglePattern(int n){
        System.out.println("\nLeft Aligned Triangle Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=0 ; j--) {
                if(i >= j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

    public void invertedLeftAlignedTrianglePattern(int n){
        System.out.println("\nInverted Left Aligned Triangle Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                    if(j >= i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }

            }
            System.out.println();

        }

    }



}
