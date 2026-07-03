package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class Multiplex {

    public static void main(String[] args) {
        Multiplex multiplex = new Multiplex();
        multiplex.displayScreenNameMovies();
    }

    public void displayScreenNameMovies(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Book ticket ");
        System.out.println("Screen A : SpiderMan Brand New Day 2026");
        System.out.println("Screen B : Project Hail Mary 2026");
        System.out.println("Screen C : Avengers: Doomsday");

        System.out.println("Enter Screen Name : ");
        String Name = scanner.nextLine();

        if("A".equalsIgnoreCase(Name)){
            Screen A = new Screen("A","SpiderMan Brand New Day", 60, 150);
            movieSystem(A);

        }
        else if("B".equalsIgnoreCase(Name)){
            Screen B = new Screen("B", "Project Hail Mary", 120, 120);
            movieSystem(B);
        }
        else if("C".equalsIgnoreCase(Name)){
            Screen C = new Screen("C", "Avengers: Doomsday", 180, 180);
            movieSystem(C);
        }

        scanner.close();
    }

    public void movieSystem(Screen movie){

        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 3)
            {
                System.out.println("1. Check seat available");
                System.out.println("2. Book tickets");
                System.out.println("3. Exit");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        if(movie.isSeatFull()){
                            System.out.println("No Seats available");
                            break;
                        }
                        System.out.println("Seats available");
                        break;

                    case 2:
                        System.out.println("Enter number seats : ");
                        int count = scanner.nextInt();
                        movie.bookingTickets(count);
                        break;

                    case  3:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Invalid Choice "+ choice);
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }



}
