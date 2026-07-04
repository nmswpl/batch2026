package in.co.nmsworks.training.week3.exercise;

public interface Language {
    public void welcome(String name);
    void thankYou(String name);
}

 class Tamil implements Language {
     @Override
     public void welcome(String name) {
         System.out.println("Vanakkam..." + name);
     }

     @Override
     public void thankYou(String name) {
         System.out.println("Nandrii.. " + name + " Taataa! ");
     }
 }

 class English implements  Language{
        public void welcome(String name) {
            System.out.println("Welcome..." + name);
        }

        @Override
        public void thankYou(String name) {
            System.out.println("Thank You "+ name + " Good Bye! ");
        }

}
class Hindi implements Language{
    public void welcome(String name) {
        System.out.println("Namaste.. " + name);
    }

    @Override
    public void thankYou(String name) {
        System.out.println("Dhanyavadhh "+ name + " Good Bye! ");
    }
}
