package in.co.nmsworks.training.week2.exercise;

public class PatternProgram {

        public static void main(String[] args) {
            PatternProgram program = new PatternProgram();
            program.numericPattern1();
            System.out.println();
            program.numericPattern2();
            System.out.println();
            program.starPattern1();
            System.out.println();
            program.alphabetPattern1();
        }

        public void numericPattern1() {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        public void numericPattern2() {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= 8 - i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

        public void starPattern1() {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public void alphabetPattern1() {
            char ch = 'A';
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                }
                ch++;
                System.out.println();
            }
        }
    }

