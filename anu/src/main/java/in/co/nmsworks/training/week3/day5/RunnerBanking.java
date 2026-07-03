package in.co.nmsworks.training.week3.day5;

import java.util.Scanner;

public class RunnerBanking {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        BankingSystem bankingSystem = new BankingSystem(10000);
        int choice=0;
        while(choice!=4){

            System.out.println("1.deposite");
            System.out.println("2.withdrawal");
            System.out.println("3.check balance");
            System.out.println("4.statement");
            System.out.println("enter the choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter the amount : ");
                    Float amount = scanner.nextFloat();
                    bankingSystem.deposit(amount);
                    break;
                case 2:
                    System.out.println("enter the withdrawal amount : ");
                    Float amounts = scanner.nextFloat();
                    bankingSystem.withdrawal(amounts);
                    break;
                case 3:
                    bankingSystem.checkBalance();
                    break;
                case 4:
                    System.out.println(bankingSystem.getStatement());
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }
}
