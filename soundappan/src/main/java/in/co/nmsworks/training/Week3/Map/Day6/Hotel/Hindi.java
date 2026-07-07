package in.co.nmsworks.training.Week3.Map.Day6.Hotel;

public class Hindi implements Language{
    @Override
    public void welcome(String name) {
        System.out.println("स्वागत");
    }

    @Override
    public void goodBye(String name) {
        System.out.println("अलविदा");
    }
}
