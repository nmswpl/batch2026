package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal, LandBased{
    @Override
    public void eats() {
        System.out.println("Cat eats Fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");

    }

    public void play() {

    }

    @Override
    public Boolean canWalk() {
        return true;
    }

    @Override
    public Boolean canClimb() {
        return true;
    }
}
