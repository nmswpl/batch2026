package in.co.nmsworks.training.week2.day5;

public class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.rightTriangle(7);
        p.invertedRightTriangle(7);
        p.leftAlignedTriangle(7);
        p.invertedLeftAlignedTriangle(7);
        p.pyramid(7);
    }

    private void pyramid(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }System.out.println();
        }

    }



    private void invertedLeftAlignedTriangle(int n) {
        System.out.println();

        for (int i = 0; i < n  ; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");

            }
            for (int j = n; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void leftAlignedTriangle(int n) {
        System.out.println();

                for (int i = 1; i <=n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }






    private void invertedRightTriangle(int n) {
        System.out.println();
        for (int j = n; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    void rightTriangle(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
