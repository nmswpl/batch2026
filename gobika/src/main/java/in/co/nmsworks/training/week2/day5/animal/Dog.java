package in.co.nmsworks.training.week2.day5.animal;

public class Dog implements Animal, LandBased {
    @Override
    public void eat() {
        System.out.println("Bones");
    }

    @Override
    public void makeSound() {
        System.out.println("Bow Bow");
    }
    public void smell(){
        System.out.println("Can Smell..");
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canClaim() {
        return false;
    }
}
