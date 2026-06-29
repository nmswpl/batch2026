package in.co.nmsworks.training.week2.day4;

public class Dog implements Animal, LandBased{
    @Override
    public void makeSound() {
        System.out.println("Bow Bow");
    }

    @Override
    public void eat() {
        System.out.println("Dog licks bone");
    }

    public void smell() {

    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canClimb() {
        return false;
    }
}
