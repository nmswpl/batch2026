package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal, LandBased {
    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks...");
    }

    public void smell(){
        System.out.println("Dog smells...");
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
