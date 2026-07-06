package in.co.nmsworks.week2.day5;

public class Dog implements Animal, LandBased {
    public void makeSound(){
        System.out.println("Bark");
    }

    public void eat(){
        System.out.println("Bone");
    }


    public void smell(){
        System.out.println("Dog has good smell sense");
    }

    @Override
    public boolean canclimb() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}
