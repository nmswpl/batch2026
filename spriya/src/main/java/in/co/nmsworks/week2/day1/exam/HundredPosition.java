package in.co.nmsworks.week2.day1.exam;

public class HundredPosition {
    public static void main(String[] args) {
        findPosition();
    }

    public static void findPosition() {
        int num = 256;
        int pos = num / 100;
        String[] position = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("The Hundreth position of the number " + num + " is :" + position[pos]);
    }
}
