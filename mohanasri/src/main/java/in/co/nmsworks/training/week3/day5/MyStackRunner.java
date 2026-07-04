package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MyStackRunner
{
    public static void main(String[] args)
    {


        MyStackRunner stackRunner = new MyStackRunner();
        //stackRunner.run();
        //stackRunner.runQueue();

    }

    private void runQueue() {
        MyQueue queue = new MyQueue();
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 6)

            {
                System.out.println("\n1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Peak");
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
                        int num = scanner.nextInt();
                        queue.enqueue(num);
                        break;

                    case 2:
                        queue.dequeue();
                        break;

                    case 3:
                        queue.peak();
                        break;

                    case 4:
                        queue.printQueue();
                        break;

                    case 5:
                        queue.size();
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

    private void run()
    {
        MyStack stack = new MyStack();
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 6)

            {
                System.out.println("\n1. Push");
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
                        System.out.println("Enter a number : ");
                        int num = scanner.nextInt();
                        stack.push(num);
                        break;

                    case 2:
                        stack.pop();
                        break;

                    case 3:
                        stack.peak();
                        break;

                    case 4:
                        stack.printStack();
                        break;

                    case 5:
                        stack.size();
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
