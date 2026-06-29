package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal,LandBased{

    @Override
    public void eat() {
        System.out.println("Cat Food");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void play() {
        System.out.println("Cat play");
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canClimb() {
        return true;
    }
}
