package in.co.nmsworks.training.week2.Day5.Interface;

public class IntfRunner {
    public static void main(String[] args) {
        Dog germanShepard = new Dog();
        //dogMethod(germanShepard);
        LandBased dog=new Dog();
        byObject(dog);

//        Animal cat=new Cat();
        LandBased cat=new Cat();
        byObject(cat);


        Cat catty = new Cat();
        //catMethod(catty);

//        animalMethod(germanShepard);
//        animalMethod(catty);

        landBasedMethod(germanShepard);
        landBasedMethod(catty);
    }

    private static void byObject(LandBased dog) {
        dog.eats();
        dog.makeSound();
        dog.canWalk();
        dog.canClimb();
    }

    private static void landBasedMethod(LandBased landBased) {
        System.out.println(landBased.canClimb());
        landBased.canWalk();
        landBased.eats();
        landBased.makeSound();

    }

//    private static void animalMethod(Animal animal) {
//        animal.makeSound();
//        animal.eats();
//
//    }
//
//    private static void catMethod(Cat catty) {
//        catty.eats();
//        catty.makeSound();
//    }
//
//    private static void dogMethod(Dog germanShepard) {
//        germanShepard.eats();
//        germanShepard.makeSound();
//    }

}
