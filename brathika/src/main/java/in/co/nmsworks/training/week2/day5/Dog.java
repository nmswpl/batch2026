package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal, LandBased{
    @Override
    public void eats() {
        System.out.println("Bones");
    }

    @Override
    public void makeSound() {
        System.out.println("Bow Bow");

    }

    public void smell() {

    }

    @Override
    public Boolean canWalk() {
        return true;
    }

    @Override
    public Boolean canClimb() {
        return false;
    }
}
