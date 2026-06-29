package in.co.nmsworks.training.week2.day6;

public class PatternProgram {
    public static void main(String[] args) {

        PatternProgram obj = new PatternProgram();
        obj.rightTrianglePattern(6);
        obj.invertedRightTrianglePattern(7);
        obj.rightTrianglePattern(6, '*');
        obj.rightTrianglePattern(6, 'A');

    }

    public void rightTrianglePattern(int n){
        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println(" ");
        }

    }

    public void rightTrianglePattern(int n, char ch){
        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(ch + " ");

            }
            ch++;
            System.out.println(" ");
        }

    }

    private void invertedRightTrianglePattern(int n) {
        System.out.println("\nInverted Right Triangle Pattern:");
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print(i+" ");
            }
            System.out.println(" ");

        }
    }
}
