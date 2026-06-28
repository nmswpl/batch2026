package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal, LandBased{
    @Override
    public void eat() {
        System.out.println("Cat eats milk");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows...");
    }

    public void play(){
        System.out.println("Cat plays...");
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
