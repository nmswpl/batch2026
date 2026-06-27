package in.co.nmsworks.training.week2.Day5;

public class RunnerPattern {
    public static void main(String[] args) {
        Pattern pattern=new Pattern();
        System.out.println("Right Triangle");
        pattern.RightTriangle();

        System.out.println("Inverted Right Triangle");
        pattern.InvertedRightTriangle();

        System.out.println("Left-Aligned Triangle");
        pattern.LeftAlignedTriangle();

        System.out.println("Inverted Left-Aligned Triangle");
        pattern.InvertedLeftAlignedTriangle();

        System.out.println("Full Pyramid");
        pattern.FullPyramid();
    }
}
