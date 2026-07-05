package in.co.nmsworks.training.week3.day6;

public class Engilsh implements Language {
    @Override
    public String checkInMessage(String name) {
        return "Welcome, "+name+" have a plesant stay.";
    }

    @Override
    public String checkOutMessage(String name) {
        return "Thank you!! "+name+" hope you had a wonderfull experience";
    }
}
