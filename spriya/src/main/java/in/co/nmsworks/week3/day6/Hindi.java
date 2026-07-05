package in.co.nmsworks.week3.day6;

public class Hindi implements CheckInOrOut {
    @Override
    public void checkIn() {
        System.out.println("नमस्ते");
    }

    @Override
    public void checkOut() {
        System.out.println("धन्यवाद, फिर से आइए");
    }
}
