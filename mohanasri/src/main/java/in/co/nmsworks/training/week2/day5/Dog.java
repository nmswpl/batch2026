package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal,LandBased {
    @Override
    public void eats(){
        System.out.println("meat");
    }

    @Override
    public void makeSound() {
        System.out.println("bow bow");
    }
    public void smell(){
        System.out.println("dog smells");
    }

    @Override
    public boolean canClimb() {
        return false;

    }

    @Override
    public boolean canWalk() {
        return true;
    }
}
