package in.co.nmsworks.training.Week3.Map.Day5;

import java.util.Scanner;

public class MovieRunner {
    public static void main(String[] args) {
        Multiplex m1 = new Multiplex();
        m1.displayScreens();
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 4)
            {
                System.out.println("1. Book Screen 1");
                System.out.println("2. Book Screen 2");
                System.out.println("3. Book Screen 3");
                System.out.println("4. exit \n");
                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        int Ticket= scanner.nextInt();
                        m1.bookTicket(1,Ticket);
                        break;

                    case 2:
                        int value= scanner.nextInt();
                        m1.bookTicket(2,value);
                        break;

                    case 3:
                       int val= scanner.nextInt();
                       m1.bookTicket(3,val);
                        break;

                    case 4:
                        System.out.println("Thank you");
                        break;
                    default:
                        System.out.println("Invalid Choice "+ choice);
                }
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    }
