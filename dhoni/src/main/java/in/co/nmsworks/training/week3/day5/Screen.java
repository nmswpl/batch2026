package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class Screen {
    private String ScreenName;
    private final String movieName;
    private int totalSeat;
    private int occupied;
    private final int price;

    public Screen(String screenName,String movieName, int totalSeat, int price) {
        this.ScreenName = screenName;
        this.movieName = movieName;
        this.totalSeat = totalSeat;
        this.price = price;
        occupied = 0;
    }

    public boolean isSeatFull(){
        int remaining = totalSeat-occupied;
        System.out.println("remaining seats : "+ remaining);
        return (occupied == totalSeat);
    }

    public void bookingTickets(int count){
        Scanner scanner = new Scanner(System.in);
        if(isSeatFull()){
            System.out.println("No seat available");
            return;
        }

        int available = totalSeat-occupied;
        System.out.println("No of seats available : " + available);

        System.out.println("Screen " + getScreenName());
        for(int i = occupied+1; i <= count; i++){
            System.out.println("Screen " + getScreenName() + " : " + i);
        }

        System.out.println("Screen " + getScreenName() + " no of seats : " + count);
        System.out.println("Confirm payment [Yes/No] : " );
        String confirm = scanner.nextLine();

        if("Yes".equalsIgnoreCase(confirm)){
            confirmBooking(count, scanner);
        }

        System.out.println("Thank you for visiting");

    }


    public void confirmBooking(int count , Scanner scanner) {

        System.out.println("Movie name : " + getMovieName());
        System.out.println("Total Price : " + getPrice() * count);
        System.out.println("Enter phone number :");
        scanner.nextLine();
        System.out.println("Bill sent to your phone number");
        System.out.println("Bill payed...!");

        occupied = occupied+count;
    }


    public String getScreenName() {
        return ScreenName;
    }

    public String getMovieName(){
        return movieName;
    }

    public void setScreenName(String screenName) {
        ScreenName = screenName;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }

    public int getPrice() {
        return price;
    }
}
