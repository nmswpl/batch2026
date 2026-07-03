package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class StackRunner
{
    public static void main(String[] args)
    {
        StackRunner stackRunner = new StackRunner();
        stackRunner.run();
    }

    private void run()
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            MyStack myStack = new MyStack();
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
                        System.out.println("Enter a number : ");
                        int number = scanner.nextInt();
                        myStack.push(number);
                        break;

                    case 2:
                        myStack.pop();
                        break;

                    case 3:
                        myStack.top();
                        break;

                    case 4:
                        myStack.print();
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

