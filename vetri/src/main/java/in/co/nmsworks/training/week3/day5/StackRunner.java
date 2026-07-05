package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class StackRunner {
    public static void main(String[] args) {
        StackRunner stackRunner = new StackRunner();
        stackRunner.run();

    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            MyStack st = new MyStack();
            MyQueue mq = new MyQueue();
            int choice = 0;
            while (choice != 6) {
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Top");
                System.out.println("4. Display");
                System.out.println("5. Size");
                System.out.println("6. exit \n");
                System.out.println("7. enqueue");
                System.out.println("8. dequeue");
                System.out.println("9. Peak");
                System.out.println("10. Display queue");
                System.out.println("11. Size");


                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println("Enter a element to insert in the stack");
                        int val = scanner.nextInt();
                        st.push(val);
                        System.out.println("Push completed");
                        break;

                    case 2:
                        System.out.println("Element poped from Stack is: " + st.pop());
                        break;

                    case 3:
                        System.out.println("Top element is : " + st.top());
                        break;

                    case 4:
                        System.out.println("Elements of the stack : ");
                        st.printStack();
                        break;

                    case 5:
                        System.out.println("Size of the Stack is :" + st.size());
                        break;

                    case 6:
                        System.out.println("Thank you");
                        break;

                    case 7:
                        System.out.print("Enter a element to insert in the queue:");
                        int vals = scanner.nextInt();
                        mq.enQueue(vals);
                        System.out.println(" ");
                        System.out.print("element inserted into completed");
                        System.out.println(" ");
                        break;

                    case 8:
                        System.out.print("Element poped from Stack is: " + mq.deQueue());
                        System.out.println(" ");
                        break;

                    case 9:
                        System.out.print("Peak element is : " + mq.peak());
                        System.out.println(" ");
                        break;

                    case 10:
                        System.out.print("Elements of the queue : ");
                        mq.printQueue();
                        System.out.println(" ");
                        break;

                    case 11:
                        System.out.print("Size of the queue is :" + mq.size());
                        System.out.println(" ");
                        break;

                    default:
                        System.out.println("Invalid Choice " + choice);
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 