package in.co.nmsworks.training.week2.Day5;

public class Cat implements Animal,LandBased{

    @Override
    public void eat() {
        System.out.println(" cat food");
    }

    @Override
    public void makeSound() {
        System.out.println("making cat some sound");
    }

    public void play(){
        System.out.println("cat playing well ");
    }

    @Override
    public boolean canWalk() {
        System.out.println("True  can walk");
        return true;
    }

    @Override
    public boolean canCilent() {
        System.out.println("True cat can cilent");
        return true;
    }
}
