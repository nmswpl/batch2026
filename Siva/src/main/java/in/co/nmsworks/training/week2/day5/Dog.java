package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal,LandBased{

    @Override
    public void eat() {
        System.out.println("Dog Food");
    }

    @Override
    public void makeSound() {
        System.out.println("Wovvv");
    }

    public void smell() {
        System.out.println("Dog smell");
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
