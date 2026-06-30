package in.co.nmsworks.training.week2.exercise;

public class PatternProgram {

        public static void main(String[] args) {
            PatternProgram program = new PatternProgram();
            program.numericPattern1(7);
            System.out.println();
            program.numericPattern2(7);
            System.out.println();
            program.starPattern1(7);
            System.out.println();
            program.alphabetPattern1(7);
        }

        public void numericPattern1(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        public void numericPattern2(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

        public void starPattern1(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public void alphabetPattern1(int n) {
            char ch = 'A';
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                }
                ch++;
                System.out.println();
            }
        }
    }

