package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal,LandBased{
    public void eat()
    {
        System.out.println("Eat fish");
    }
    public void makeSound()
    {
        System.out.println("meow");
    }
    public boolean canClimb()
    {
        return true;
    }
    public boolean canWalk()
    {
        return true;
    }
}
