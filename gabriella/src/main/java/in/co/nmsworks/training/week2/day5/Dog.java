package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal, LandBased{
    @Override
    public void eats() {
        System.out.println("Dog eats");
    }

    @Override
    public void makesSound() {
        System.out.println("Barks");
    }

    public void smell(){
        System.out.println("Dog smells");
    }

    @Override
    public boolean canClimb(){
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}
