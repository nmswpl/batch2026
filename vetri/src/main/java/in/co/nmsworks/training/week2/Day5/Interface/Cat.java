package in.co.nmsworks.training.week2.Day5.Interface;

public class Cat implements Animal,LandBased{
    @Override
    public void makeSound() {
        System.out.println("meow");

    }

    @Override
    public void eats() {
        System.out.println("Eats Cats food");
    }

    public void play(){
        System.out.println("Playing");
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
