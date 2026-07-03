package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class QueueRunner {
    public static void main(String[] args)
    {
        QueueRunner queueRunner = new QueueRunner();
        queueRunner.run();
    }

    private void run()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            MyQueue myQueue = new MyQueue();
            while (choice != 6)
            {
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Peek");
                System.out.println("4. Display");
                System.out.println("5. Size");
                System.out.println("6. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("Enter a number : ");
                        int number = scanner.nextInt();
                        myQueue.enqueue(number);
                        break;

                    case 2:
                        myQueue.dequeue();
                        break;

                    case 3:
                        myQueue.peek();
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
