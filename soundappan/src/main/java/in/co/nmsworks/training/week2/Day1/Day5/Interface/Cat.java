package in.co.nmsworks.training.week2.Day1.Day5.Interface;

public class Cat implements Animal, Land {
    @Override
    public void makeSound() {
        System.out.println("cat make sound");
    }

    @Override
    public void eat() {
        System.out.println("cat make sound");
    }
    public void play(){
        System.out.println("Cat play");
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
