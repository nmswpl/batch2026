package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class RunnerQueue
{
    public static void main(String[] args)
    {
        RunnerQueue stackRunner = new RunnerQueue();
        stackRunner.run();
    }

    private void run()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            MyQueue myQueue = new MyQueue();
            int choice = 0;
            while (choice != 6)
            {
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Top");
                System.out.println("4. Display");
                System.out.println("5. Size");
                System.out.println("6. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();
                Integer number= null;

                switch (choice)
                {
                    case 1:
                        number=scanner.nextInt();
                        myQueue.enque(number);
                        break;

                    case 2:
                        myQueue.deque();
                        break;

                    case 3:
                        myQueue.peek();
                        break;

                    case 4:
                        myQueue.printQueue();
                        break;

                    case 5:
                        myQueue.size();
                        break;

                    case 6:
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
