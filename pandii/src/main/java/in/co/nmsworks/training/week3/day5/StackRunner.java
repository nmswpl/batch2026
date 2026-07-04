package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackRunner
{
    public static void main(String[] args)
    {
        StackRunner stackRunner = new StackRunner();
//        stackRunner.run();
        stackRunner.queue();

    }

    private void queue() {
        try (Scanner scanner = new Scanner(System.in))
        {
            MyQueue myQueue=new MyQueue();
            int choice = 0;
            while (choice != 6)
            {
                System.out.println("1. EnQueue");
                System.out.println("2. DeQueue");
                System.out.println("3. Front");
                System.out.println("4. Display");
                System.out.println("5. Size");
                System.out.println("6. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.println("give element");
                        myQueue.enQueue(scanner.nextInt());
                        break;

                    case 2:
                        myQueue.deQueue();
                        break;

                    case 3:
                        myQueue.front();
                        break;

                    case 4:
                        myQueue.printStack();
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

    private void run()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            MyStack myStack=new MyStack();
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
                        System.out.println("give element");
                        myStack.push(scanner.nextInt());
                        break;

                    case 2:
                        myStack.pop();
                        break;

                    case 3:
                        myStack.top();
                        break;

                    case 4:
                        myStack.printStack();
                        break;

                    case 5:
                        myStack.size();
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
 