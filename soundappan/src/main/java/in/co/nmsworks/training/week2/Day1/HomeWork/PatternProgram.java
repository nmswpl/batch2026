package in.co.nmsworks.training.week2.Day1.HomeWork;

public class PatternProgram {
    public static void numericPattern(int n){
        System.out.println("Numeric Pattern 1 : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void starPatternModel(int n){
        System.out.println("Numeric Pattern 2 : ");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void starPattern(int n){
        System.out.println("Star Pattern 1 : ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void alphabetPattern(int n){
        System.out.println("Alphabet Pattern 1 :");
        char character='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(character);
            }
            System.out.println();
            character++;
        }
    }


    public static void main(String[] args) {
        numericPattern(7);
        starPatternModel(7);
        starPattern(7);
        alphabetPattern(7);

    }
}
