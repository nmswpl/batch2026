package in.co.nmsworks.training.week3.day5;

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

        MyStack stack = new MyStack();

        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 6)
            {
                System.out.println("\n--- Stack Menu ---");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Top (Peek)");
                System.out.println("4. Display");
                System.out.println("5. Size");
                System.out.println("6. Exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter element to push: ");
                        int value = scanner.nextInt();
                        stack.push(value);
                        break;

                    case 2:
                        stack.pop();
                        break;

                    case 3:
                        int topElement = stack.peek();
                        if (topElement != -1) {
                            System.out.println("Top Element: " + topElement);
                        }
                        break;

                    case 4:
                        stack.print();
                        break;

                    case 5:
                        System.out.println("Stack Size: " + stack.size());
                        break;

                    case 6:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Choice " + choice);
                }
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}