package in.co.nmsworks.training.week2.weekend;

public class PatternPrograms {
    public static void main(String[] args) {
        numericPattern(7);
        invertedNumericPattern(7);
        starPattern(7);
        alphabetPattern(7);
    }

    // 1. Numeric pattern 1
    private static void numericPattern(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    // 2. Numeric pattern 2
    public static void invertedNumericPattern(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num-i+1; j++){
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    // 3. Start pattern 1
    public static void starPattern(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    // 4. Alphabet pattern 1
    public static void alphabetPattern(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

}
