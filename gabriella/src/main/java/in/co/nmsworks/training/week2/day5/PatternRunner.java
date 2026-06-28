package in.co.nmsworks.training.week2.day5;

import java.util.regex.Pattern;

public class PatternRunner {
    public static void main(String[] args) {
        PatternPrinting pattern1 = new PatternPrinting();
        pattern1.rightTriangle(7);

        System.out.println(" ");

        PatternPrinting pattern2 = new PatternPrinting();
        pattern2.invertedRightTriangle(7);

        System.out.println(" ");

        PatternPrinting pattern3 = new PatternPrinting();
        pattern3.leftAlignedTriangle(7);

        System.out.println(" ");

        PatternPrinting pattern4 = new PatternPrinting();
        pattern4.invertedLeftAligned(7);

        System.out.println(" ");

        PatternPrinting pattern5 = new PatternPrinting();
        pattern5.pyramid(7);

        System.out.println(" ");
    }
}
