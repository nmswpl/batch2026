package in.co.nmsworks.training.week1.exam;

public class HundredthPositon {

    public static void main(String[] args) {

        int num = 647;

        int hundred = num / 100;

        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        if(hundred >= 1 && hundred <= 9) {
            System.out.println(words[hundred]);
        }
        else {
            System.out.println("Invalid number");
        }
    }
}


