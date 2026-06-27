package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal,LandBased{
    @Override
    public void eats() {
        System.out.println("fishhh");
    }

    @Override
    public void makeSound() {
        System.out.println("Meoww");
    }
    public void play(){
        System.out.println("cat plays");

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

