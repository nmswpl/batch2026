package in.co.nmsworks.training.week2.Day1.Day5.Pattern;

public class PatterProgram {
    public static void rightTriangle(int num) {
        System.out.println("1. Right Triangle");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedRightTriangle(int num) {
        System.out.println("2. Inverted Right Triangle");
        for (int i = 0; i < num; i++) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void leftAlignedTriangle(int num){
    System.out.println("3. Left-Aligned Triangle");
        for(int i=1;i<=num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
}
public static void invertedLeftAlignedTriangle(int num){
    System.out.println("4. Inverted Left-Aligned Triangle");
        for(int i=0;i<num;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<num-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
public static void fullPyramid(int num){
    System.out.println("5. Full Pyramid");
        for(int i=1;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=2*(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
}
        public static void main (String[]args){
            rightTriangle(7);
            invertedRightTriangle(7);
            leftAlignedTriangle(7);
            invertedLeftAlignedTriangle(7);
            fullPyramid(7);
        }
    }


