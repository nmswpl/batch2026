package in.co.nmsworks.training.week3.weekendpractice;

public class TamilLanguage implements Language {
    @Override
    public void welcome() {
        System.out.println("Vanakkam !!");
//        return false;
    }

    @Override
    public void thankyou() {
        System.out.println("Nandri !!");
    }
}
