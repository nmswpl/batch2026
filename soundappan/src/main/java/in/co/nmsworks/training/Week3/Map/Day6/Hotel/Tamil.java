package in.co.nmsworks.training.Week3.Map.Day6.Hotel;

public class Tamil implements Language{

    @Override
    public void welcome(String name) {
        System.out.println("வரவேற்கிறோம்");
    }

    @Override
    public void goodBye(String name) {
        System.out.println("விடைபெறுகிறேன்");
    }
}
