package in.co.nmsworks.training.week3.day5;

public class MyStackRunner {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("Hema");
        stack.push("Thanu");
        stack.push("Sheela");

        stack.printStack();

        System.out.println("Top = "+stack.top());
        System.out.println("Size = "+stack.size());
        System.out.println("Pop = "+stack.pop());
        stack.printStack();
    }
}