package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        //dogMethods(dog);
        //catMethod(cat);

       // animalMethod(dog);
       // animalMethod(cat);
        landBasedMethod(dog);
        landBasedMethod(cat);
    }

    private static void animalMethod(Animal animal) {
    }
    private static void landBasedMethod(LandBased lb){
        lb.eat();
        lb.makeSound();
        System.out.println("can Walk : "+lb.canWalk());
        System.out.println("can climb : "+lb.canClimb());
    }

    private static void dogMethods(Dog dog) {
        dog.eat();
        dog.makeSound();
    }

    private static void catMethod(Cat cat) {
        cat.makeSound();
        cat.eat();
    }


}
