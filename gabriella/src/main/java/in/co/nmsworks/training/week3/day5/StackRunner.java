package in.co.nmsworks.training.week3.day5;
import java.util.Scanner;

public class StackRunner
{
    public static void main(String[] args)
    {
        StackRunner stackRunner = new StackRunner();
        //stackRunner.run();
        stackRunner.queueRunner();
    }

    private void queueRunner() {
        MyQueue queue = new MyQueue();
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
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
                        System.out.print("Enter a number: ");
                        System.out.flush();
                        Integer number = scanner.nextInt();
                        queue.enqueue(number);
                        break;

                    case 2:
                        System.out.println("Dequeued element: " + queue.dequeue());
                        break;

                    case 3:
                        queue.peek();
                        break;

                    case 4:
                        queue.printQueue();
                        break;

                    case 5:
                        System.out.println("Queue size: " + queue.getSize());
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
                        System.out.print("Enter a number: ");
                        System.out.flush();
                        Integer number = scanner.nextInt();
                        stack.push(number);
                        break;

                    case 2:
                        System.out.println("Popped element: " + stack.pop());
                        break;

                    case 3:
                        stack.top();
                        break;

                    case 4:
                        stack.printStack();
                        break;

                    case 5:
                        System.out.println("Stack size: " + stack.getSize());
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
 