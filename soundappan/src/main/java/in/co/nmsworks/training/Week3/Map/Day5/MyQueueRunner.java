package in.co.nmsworks.training.Week3.Map.Day5;

import java.util.Queue;
import java.util.Scanner;

public class MyQueueRunner {
    public static void main(String[] args) {
        {
            MyQueue q1=new MyQueue();
            try (Scanner scanner = new Scanner(System.in))
            {
                int choice = 0;
                while (choice != 6)
                {
                    System.out.println("1. QUEUE");
                    System.out.println("2. DEQUEUE");
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
                            int value= scanner.nextInt();
                            q1.push(value);
                            break;

                        case 2:
                            System.out.println(q1.pop());
                            break;

                        case 3:
                            System.out.println(q1.peek());
                            break;

                        case 4:
                            q1.display();
                            break;

                        case 5:
                            System.out.println(q1.size());
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


}

