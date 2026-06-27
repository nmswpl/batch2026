package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal, LandBased{

    @Override
    public void eats() {
        System.out.println("Dog EAT");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog's SOUND");
    }

    public void smell()
    {
        System.out.println("Smell sensitive!");
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
