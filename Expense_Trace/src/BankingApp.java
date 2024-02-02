import java.util.Arrays;
import java.util.Scanner;

public class BankingApp{
    public static void main(String[] ar) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("****************Banking App************");
        Account acc = new Account();

        int expression;
        do {
            System.out.println("Total amount in account: Rs\t" + acc.bankBalance);
            System.out.println("What do you want to do:\n 1 for Deposit \n 2 for withdraw  \n 3 exit()");
            System.out.println("\n");
            System.out.println("Enter what you want to do ? ->");
            expression = sacnner.nextInt();
            switch (expression) {
                case 1:
                    System.out.println("Amount to Deposit");
                    System.out.println("\n");
                    double a = sacnner.nextDouble();
                    double b = acc.deposit(a);
                    System.out.println("Amount you have right know:\n" + b);
                    break;

                case 2:
                    System.out.println("Amount to withdraw");
                    double m = sacnner.nextDouble();
                    double n = acc.withdraw(m);
                    System.out.println("Amount you have right know:\t" + n);
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("You Should choose the right option");
                    System.out.println("\n");


            }

        } while (expression != 3);


    }
}