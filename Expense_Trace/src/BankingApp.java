import java.util.Scanner;
public class BankingApp{
    public static void main(String[] ar) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("****************Banking App************");
        System.out.println("Enter your account number");
        double account_num= sacnner.nextDouble();
        Account AccCreater = new Account();
        System.out.println("Enter your account balance");
        double balance= sacnner.nextDouble();
        AccCreater.setAccountNumber(account_num);
        AccCreater.setBalance(balance);
        System.out.println("your account number is " +AccCreater.getAccountNumber() );
        System.out.println("your account balance is " + AccCreater.getBalance());
        int expression;
        do {
            System.out.println("Enter what you want to do ? ->\n1.\n2.\n3");
            expression = sacnner.nextInt();
            switch (expression) {
                case 1 -> {
                    System.out.println("Amount to Deposit");
                    System.out.println("\n");
                    double a = sacnner.nextDouble();
                    double b = AccCreater.deposit(a);
                    System.out.println("Amount you have right know:\n" + b);
                }
                case 2 -> {
                    System.out.println("Amount to withdraw");
                    double m = sacnner.nextDouble();
                    double n = AccCreater.withdraw(m);
                    System.out.println("Amount you have right know:\t" + n);
                    System.out.println("\n");
                }
                default -> {
                    System.out.println("You Should choose the right option");
                    System.out.println("\n");
                }
            }
        } while (expression != 3);


    }
}