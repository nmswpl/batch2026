package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal,LandBased {
    public void eat()
    {
        System.out.println("Eat pedigree");
    }
    public void makeSound()
    {
        System.out.println("Bow Bow");
    }
    public boolean canClimb()
    {
        return false;
    }
    public boolean canWalk()
    {
        return true;
    }
}
