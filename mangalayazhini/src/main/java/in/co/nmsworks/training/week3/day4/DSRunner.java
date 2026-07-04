package in.co.nmsworks.training.week3.day4;
import java.util.Scanner;

public class DSRunner {


    public static void main(String[] args) {
        DSRunner runner = new DSRunner();
//        runner.runStack();
        runner.runQueue();

    }

    private void runQueue() {
        MyQueue myQueue = new MyQueue();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            while (choice != 6) {
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Front");
                System.out.println("4. Display");
                System.out.println("5. Size");
                System.out.println("6. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.print("Enter the number : ");
                        Integer value = scanner.nextInt();
                        myQueue.enqueue(value);
                        break;

                    case 2:
                        myQueue.dequeue();
                        break;

                    case 3:
                        myQueue.top();
                        break;

                    case 4:
                        myQueue.display();
                        break;

                    case 5:
                        break;

                    case 6:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid Choice " + choice);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void runStack() {
        MyStack myStack = new MyStack();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            while (choice != 6) {
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Top");
                System.out.println("4. Display");
                System.out.println("5. Size");
                System.out.println("6. exit \n");

                System.out.print("Enter your choice : ");
                System.out.flush();
                choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        System.out.print("Enter the number : ");
                        Integer value = scanner.nextInt();
                        myStack.push(value);
                        break;

                    case 2:
                        Integer poppedValue = myStack.pop();
                        System.out.println("The Popped value : " + poppedValue);
                        break;

                    case 3:
                        myStack.peek();
                        break;

                    case 4:
                        myStack.printStack();
                        break;

                    case 5:
                        myStack.size();
                        break;

                    case 6:
                        System.out.println("Thank you");
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



