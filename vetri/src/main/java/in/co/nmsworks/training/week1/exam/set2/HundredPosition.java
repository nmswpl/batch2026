package in.co.nmsworks.training.week1.exam.set2;

public class HundredPosition {

    public static void main(String[] args) {

        int number = 542;

        int hundredDigit = number / 100;

        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        System.out.println(words[hundredDigit]);
    }
}