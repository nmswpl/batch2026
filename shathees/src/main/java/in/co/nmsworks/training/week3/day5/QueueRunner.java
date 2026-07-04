package in.co.nmsworks.training.week3.day5;
import java.util.Scanner;
public class QueueRunner {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        try (Scanner scanner = new Scanner(System.in))
        {
            int choice = 0;
            while (choice != 6)
            {
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
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
                        System.out.println("Enter element :");
                        int element = scanner.nextInt();
                        myQueue.enqueue(element);
                        break;

                    case 2:
                        System.out.println("Deque ");
                        myQueue.dequeue();
                        break;

                    case 3:
                        int top = myQueue.peek();
                        System.out.println("top element"+top);
                        break;

                    case 4:
                        System.out.println("Display ::: ");
                        myQueue.print();
                        break;

                    case 5:
                        System.out.println("Size :"+myQueue.size());


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

