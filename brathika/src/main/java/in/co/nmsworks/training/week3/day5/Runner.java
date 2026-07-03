package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

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
                        System.out.println("Enter the number: ");
                        int number = scanner.nextInt();
                        stack.push(number);
                        break;

                    case 2:
                        stack.pop();
                        break;

                    case 3:
                        stack.top();
                        break;

                    case 4:
                        stack.print();
                        break;

                    case 5:
                        stack.size();
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
