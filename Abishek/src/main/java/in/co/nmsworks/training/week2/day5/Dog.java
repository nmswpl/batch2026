package in.co.nmsworks.training.week2.day5;

public class Dog implements LandBased{
    @Override
    public void eat() {
        System.out.println("Eat dog food");
    }

    @Override
    public void makeSound() {
        System.out.println("Wow Wow");
    }

    @Override
    public boolean canClimb() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    public void smell(){
        System.out.println("High");
    }

}
