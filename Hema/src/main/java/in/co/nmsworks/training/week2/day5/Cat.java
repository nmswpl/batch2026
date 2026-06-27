package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal, LandBased{
    @Override
    public void eats() {
        System.out.println("Cat EAT");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat's SOUND");
    }

    public void play()
    {
        System.out.println("Plays alot!");
    }

    @Override
    public boolean canClimb() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}
