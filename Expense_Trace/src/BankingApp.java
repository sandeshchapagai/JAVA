import java.util.Scanner;


public class BankingApp{
    public static void main(String[] ar) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("****************Banking App************");
        Account acc = new Account();
        System.out.println("Enter your account number");
        AccountCreator AccCreater = new AccountCreator();
        double Acc_no = sacnner.nextDouble();
        AccCreater.setBalance(Acc_no);
        System.out.println("your account number is "+Acc_no);
        double Acc_balance = sacnner.nextDouble();
        AccCreater.setBalance(Acc_balance);
        System.out.println("your account balance is "+Acc_balance);

        int expression;
        do {
            System.out.println("Your account number is ");
            System.out.println("Total amount in account: Rs\t" + Acc_no);
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