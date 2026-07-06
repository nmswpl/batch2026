package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal,LandBased{

    @Override
    public void makeSound() {
        System.out.println("cat meow");
    }

    @Override
    public void eat() {
        System.out.println("cat eats");

    }
    public void play(){
        System.out.println("cat play!!");
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
