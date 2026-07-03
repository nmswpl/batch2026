package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class QueueRunner {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

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
                        System.out.print("Enter element : ");
                        int ele = scanner.nextInt();
                            queue.enqueue(ele);
                        break;

                    case 2:
                        int element = queue.dequeue();
                        if(element == -1){
                            System.out.println("Queue is empty");
                            break;
                        }
                        System.out.println("First element removed : " + element);
                        break;

                    case 3:
                        int first = queue.peek();
                        if(first== -1){
                            System.out.println("Queue is empty");
                            break;
                        }
                        System.out.println("First element : " + queue.peek());
                        break;

                    case 4:
                        System.out.println("Element in list");
                        queue.display();
                        break;

                    case 5:
                        System.out.println("size : " + queue.getSize());
                        break;

                    case 6:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Choice "+ choice);
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



    }
}
