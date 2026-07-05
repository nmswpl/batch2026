package in.co.nmsworks.training.week3.day6;

public class Tamil implements Language {

    @Override
    public void checkIn(String name) {
        System.out.println("Vanakkam "+name+ "...Engal hotel ku vanthamaiku nadri...Meendum varuga...");
    }

    @Override
    public void checkOut(String name) {
        System.out.println("Nandri "+name+" ...meendum varuga...");
    }

}
