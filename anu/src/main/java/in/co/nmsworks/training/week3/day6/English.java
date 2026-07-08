package in.co.nmsworks.training.week3.day6;

public class English implements Receptionist{
    @Override
    public void checkIn() {
        System.out.println("The guest is welcomed in their English language.");
    }

    @Override
    public void checkOut() {
        System.out.println("The guest is thanked and wished goodbye in their English language.");
    }
}
