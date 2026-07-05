package in.co.nmsworks.training.week3.day5.stackqueue;

import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        Runner runner = new Runner();
//        runner.stackRun();
        runner.queueRunner();

    }

    private void queueRunner() {
        try (Scanner scanner = new Scanner(System.in))
        {

            MyQueue queue = new MyQueue();
            int choice = 0;
            while (choice != 6)
            {
                System.out.println("1. enqueue");
                System.out.println("2. dequeue");
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
                        System.out.println("enter value to enqueue : ");
                        int value = scanner.nextInt();
                        System.out.println(queue.enqueue(value));
                        break;

                    case 2:
                        System.out.println(queue.dequeue());
                        break;

                    case 3:
                        System.out.println(queue.peak());
                        break;

                    case 4:
                        queue.print();
                        break;

                    case 5:
                        System.out.println(queue.size());
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

    private void stackRun()
    {
        try (Scanner scanner = new Scanner(System.in))
        {

            MyStack stack = new MyStack();
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
                        System.out.println("enter value to push : ");
                        int value = scanner.nextInt();
                        System.out.println(stack.push(value));
                        break;

                    case 2:
                        System.out.println(stack.pop());
                        break;

                    case 3:
                        System.out.println(stack.peak());
                        break;

                    case 4:
                        stack.print();
                        break;

                    case 5:
                        System.out.println(stack.size());
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
 