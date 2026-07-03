package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class QueueRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            MyQueue queue = new MyQueue();

            int choice = 0;
            while (choice != 6)
            {
                System.out.println("1. EnQueue");
                System.out.println("2. DeQueue");
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
                        System.out.println("Enter the number: ");
                        int number = scanner.nextInt();
                        queue.enQueue(number);
                        break;

                    case 2:
                        queue.deQueue();
                        break;

                    case 3:
                        queue.peek();
                        break;

                    case 4:
                        queue.print();
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
}
