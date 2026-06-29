package in.co.nmsworks.training.week2.day5.animal;

public class Dog implements Animal, LandBased {
    @Override
    public void eat() {
        System.out.println("dog eats");
    }

    @Override
    public void makeSound() {
        System.out.println("dog barks");
    }

    public void smell(){
        System.out.println("dog smells");
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
