package in.co.nmsworks.training.week2.day5;

public class PatternPrinting {
    public void rightTriangle(int num){
        for (int i = 0; i < num; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void invertedRightTriangle(int num){
        for (int i = num; i>0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void leftAlignedTriangle(int num){
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                if (i+j >= num-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public void invertedLeftAligned(int num){
        for (int i = 0; i < num; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = num; k > i; k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void pyramid(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
