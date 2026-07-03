package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        stackRunner();
        queueRunner();
    }

    private static void queueRunner()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;

            MyQueue queue = new MyQueue();

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
                        System.out.print("Enter a number : ");
                        int inputNumber = scanner.nextInt();
                        queue.enqueue(inputNumber);
                        break;

                    case 2:
                        queue.dequeue();
                        break;

                    case 3:
                        queue.top();
                        break;

                    case 4:
                        queue.display();
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

    private static void stackRunner()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;

            MyStack stack = new MyStack();

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
                        System.out.print("Enter a number : ");
                        int inputNumber = scanner.nextInt();
                        stack.push(inputNumber);
                        break;

                    case 2:
                        stack.pop();
                        break;

                    case 3:
                        stack.top();
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
