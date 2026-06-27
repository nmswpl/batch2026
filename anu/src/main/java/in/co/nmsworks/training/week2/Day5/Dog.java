package in.co.nmsworks.training.week2.Day5;

public class Dog implements Animal,LandBased{

    @Override
    public void eat() {
        System.out.println(" dog food");
    }

    @Override
    public void makeSound() {
        System.out.println("making dog some sound");
    }

    public void smell(){
        System.out.println("smell ");
    }

    @Override
    public boolean canWalk() {
        System.out.println("True dog can walk");
        return true;
    }

    @Override
    public boolean canCilent() {
        System.out.println("false dog can cilent");
        return false;
    }
}
