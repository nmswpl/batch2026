package in.co.nmsworks.training.week2.Day1.Day5.Interface;

public class Dog implements Animal, Land {
    @Override
    public void makeSound() {
        System.out.println("Dog make sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
    public void smell(){
        System.out.println("Dog Smell");
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canClimb() {
        return false;
    }
}
