package in.co.nmsworks.training.week2.day5;

public class Dog implements LandBased{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canClimb() {
        return false;
    }

    @Override
    public void eats() {
        System.out.println("Dog Food");
    }
    public void smell(){
        System.out.println("Sniff");
    }
}
