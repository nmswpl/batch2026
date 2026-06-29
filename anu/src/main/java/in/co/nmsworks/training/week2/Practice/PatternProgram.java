package in.co.nmsworks.training.week2.Practice;

public class PatternProgram {

    protected static void numbericPatternOne(){
        int n=7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    protected static void numbericPatternTwo(){
        int n=7;
        int count=0;
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print( (count+1)+ " ");
            }
            count++;
            System.out.println();

        }
    }

    protected static void starPatternOne(){
        int n=7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }

    protected static void alphabetPattern(){

        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
