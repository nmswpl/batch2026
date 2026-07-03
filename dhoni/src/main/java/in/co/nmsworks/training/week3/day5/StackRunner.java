package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class StackRunner {

    public static void main(String[] args) {
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
                        System.out.print("Enter element : ");
                        int ele = scanner.nextInt();
                        stack.push(ele);
                        break;

                    case 2:
                        int element = stack.pop();
                        if(element == -1){
                            System.out.println("Stack is empty");
                            break;
                        }
                        System.out.println("Pop removed : " + element);
                        break;

                    case 3:
                        System.out.println("Top element : " + stack.peek());
                        break;

                    case 4:
                        System.out.println("Element in stack");
                        stack.printStack();
                        break;

                    case 5:
                        System.out.println("size : " + stack.getSize());
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
