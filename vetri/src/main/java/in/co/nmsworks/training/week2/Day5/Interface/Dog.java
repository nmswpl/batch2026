package in.co.nmsworks.training.week2.Day5.Interface;

public class Dog implements Animal,LandBased{
    @Override
    public void makeSound() {
        System.out.println("Barks");

    }

    @Override
    public void eats() {

        System.out.println("Eats Dog food");

    }

    public void smell(){
        System.out.println("Smelling");
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
