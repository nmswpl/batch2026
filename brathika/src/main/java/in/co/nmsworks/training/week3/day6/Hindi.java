package in.co.nmsworks.training.week3.day6;

public class Hindi implements Language{
    @Override
    public String checkInMessage(String name) {
        return "नमस्ते "+name;
    }

    @Override
    public String checkOutMessage(String name) {
        return "धन्यवाद "+name;
    }
}
