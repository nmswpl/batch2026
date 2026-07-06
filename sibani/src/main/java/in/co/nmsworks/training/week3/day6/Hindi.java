package in.co.nmsworks.training.week3.day6;

public class Hindi implements Language {
    @Override
    public void checkInMessage(String name) {
        System.out.println("Namasteyy "+name+ "hamare hotel mein aapka swagat hai...");
    }

    @Override
    public void checkOutMessage(String name) {
        System.out.println("Dhanyvad "+name+" ,phir iyega...");
    }
}
