package in.co.nmsworks.week2.day6;

public class TrainingMain {
    public static void main(String[] args) {
        TrainingExercise e = new TrainingExercise();

        e.findEven();
        e.findGrade(91);
        e.multiplyArrays();
        e.searchPositionOfElementInArray(0);
        e.vowelOrConsonant('e');
        e.multiplicationTable(17);
        e.squareOfNumber();
        e.findPosition();
        e.numberEndsWithSeven();
        e.numDivisible();
        e.biggestOfThreeNumbers(5, 8, 22);
        e.countOddElements();
        e.sumOfElements();
        e.stringReverse();
        e.countEvenElements();
        System.out.println("---FACTORIAL USING RECUSRION---");
        System.out.println("The factorail is : " + e.factorial(5));
        System.out.println(" ");
        e.findLargestInArray();
        e.noOfOccurences(4);
        e.palindrome();
        e.findPrime();
    }
}
