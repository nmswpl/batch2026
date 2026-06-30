package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal,LandBased{
        @Override
        public void eat() {
            System.out.println("Eat cat food");
        }

        @Override
        public void makeSound() {
            System.out.println("Meow Meow");
        }

    @Override
    public boolean canClimb() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    public void play(){
            System.out.println("Playing");
        }
}
