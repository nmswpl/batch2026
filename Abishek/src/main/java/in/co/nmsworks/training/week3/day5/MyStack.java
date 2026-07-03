package in.co.nmsworks.training.week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {

                MyStack stackRunner = new MyStack();
                stackRunner.run();
            }


            private void run()
            {
                Stack st = new Stack();
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
                                System.out.println("Enter Number to push: ");
                                int number = scanner.nextInt();
                                st.push(number);
                                break;

                            case 2:
                                st.pop();
                                break;

                            case 3:
                                st.peek();
                                break;

                            case 4:
                                st.print();
                                break;

                            case 5:
                                System.out.println(st.size());
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
