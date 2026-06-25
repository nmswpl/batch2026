package in.co.nmsworks.training.week1.set2;

public class HundredthPosition {
    public static void main(String[] args) {
        int input = 543;

        if(input > 99 && input < 1000)
        {
            System.out.println("Hundredth position is "+ findHundred(input));
        }
        else
        {
            System.out.println("Give a three digit number");
        }
    }

    private static String findHundred(int input) {
        int num = input / 100;
        switch (num)
        {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";

        }
        return "";
    }

}
