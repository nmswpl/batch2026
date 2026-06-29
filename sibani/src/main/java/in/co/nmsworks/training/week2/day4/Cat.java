package in.co.nmsworks.training.week2.day4;

public class Cat implements Animal, LandBased{
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats mouse");
    }

    public void play() {

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
