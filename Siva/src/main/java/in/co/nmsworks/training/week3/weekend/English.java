package in.co.nmsworks.training.week3.weekend;

public class English implements Language{
    @Override
    public void checkIn() {
        System.out.println("Welcome! Your check-in is confirmed. Have a pleasant stay.");
    }

    @Override
    public void checkOut() {
        System.out.println("Thank you for staying with us. Have a safe journey!");
    }
}
