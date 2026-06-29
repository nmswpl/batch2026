package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal,LandBased{

    @Override
    public void eat() {
        System.out.println("eats");
    }

    @Override
    public void makeSound() {
        System.out.println("meows");
    }

    public void play(){
        System.out.println("cat plays");
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
