package in.co.nmsworks.training.week2.day5;

public class Cat implements LandBased{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eats() {
        System.out.println("Cat Food");
    }
    public void play(){
        System.out.println("Play Joyfully");
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
