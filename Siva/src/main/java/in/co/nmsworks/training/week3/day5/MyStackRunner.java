package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class MyStackRunner {
    public static void main(String[] args) {
        MyStackRunner sr = new MyStackRunner();
//        sr.run();
        sr.runQueue();
    }

    private void runQueue() {
        try (Scanner scanner = new Scanner(System.in))
        {
            MyQueue queue = new MyQueue();
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
                        System.out.print("Enter a value ");
                        Integer value = scanner.nextInt();
                        queue.enqueue(value);
                        break;

                    case 2:
                        Integer popValue = queue.dequeue();
                        if (popValue == Integer.MAX_VALUE)
                            System.out.println("Queue is Empty");
                        else
                            System.out.println("Pop Element :: "+popValue);
                        break;

                    case 3:
                        Integer topValue = queue.front();
                        if (topValue == Integer.MAX_VALUE)
                            System.out.println("Queue is Empty");
                        else
                            System.out.println("Top Element :: "+topValue);
                        break;

                    case 4:
                        queue.print();
                        break;

                    case 5:
                        System.out.println("Size :: "+queue.getSize());
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
                        System.out.print("Enter a value ");
                        Integer value = scanner.nextInt();
                        stack.push(value);
                        break;

                    case 2:
                        Integer popValue = stack.pop();
                        if (popValue == Integer.MAX_VALUE)
                            System.out.println("Stack is Empty");
                        else
                            System.out.println("Pop Element :: "+popValue);
                        break;

                    case 3:
                        Integer topValue = stack.top();
                        if (topValue == Integer.MAX_VALUE)
                            System.out.println("Stack is Empty");
                        else
                            System.out.println("Top Element :: "+topValue);
                        break;

                    case 4:
                        stack.printStack();
                        break;

                    case 5:
                        System.out.println("Size :: "+stack.getSize());
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
