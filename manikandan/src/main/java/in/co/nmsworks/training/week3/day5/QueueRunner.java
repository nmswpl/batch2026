package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class QueueRunner {
    public static void main(String[] args) {
        QueueRunner run = new QueueRunner();
        run.choice();
    }

    private void choice() {

        MyQueue queue = new MyQueue();

        try(Scanner sc =new Scanner(System.in)){
             int choice = 0;

             while(choice!=6){
                 System.out.println("\n--- Queue Menu ---");
                 System.out.println("1. ENQUEUE");
                 System.out.println("2. DEQUEUE");
                 System.out.println("3. Top (Peek)");
                 System.out.println("4. Display");
                 System.out.println("5. Size");
                 System.out.println("6. Exit \n");

                 System.out.print("Enter your choice : ");
                 System.out.flush();
                 choice = sc.nextInt();

                 switch (choice)
                 {
                     case 1:
                         System.out.print("Enter element to push: ");
                         int value = sc.nextInt();
                         queue.enque(value);

                         break;

                     case 2:
                         queue.dequeue();
                         break;

                     case 3:
                         int topElement = queue.peek();
                         if (topElement != -1) {
                             System.out.println("Top Element: " + topElement);
                         }
                         break;

                     case 4:
                         queue.display();
                         break;

                     case 5:
                         System.out.println("Stack Size: " + queue.size());
                         break;

                     case 6:
                         System.out.println("Thank you");
                         break;

                     default:
                         System.out.println("Invalid Choice " + choice);
                 }


             }

        }
    }
}
