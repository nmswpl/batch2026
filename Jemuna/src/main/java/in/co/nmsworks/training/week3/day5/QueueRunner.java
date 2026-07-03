package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class QueueRunner
{
    public static void main(String[] args)
    {
        QueueRunner queueRunner = new QueueRunner();
        queueRunner.run();
    }

    private void run()
    {
        MyQueue myQueue = new MyQueue();
        try (Scanner scanner = new Scanner(System.in))
        {
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

                switch (choice)
                {
                    case 1:
                        System.out.println("Enter the number :");
                        Integer value = scanner.nextInt();
                        myQueue.push(value);
                        break;

                    case 2:
                        myQueue.pop();
                        break;

                    case 3:
                        myQueue.top();
                        break;

                    case 4:
                        myQueue.print();
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
