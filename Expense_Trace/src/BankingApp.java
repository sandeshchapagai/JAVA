import java.util.Scanner;



class AccountCreator {
    private double account_number;
    private double initial_balance = 0;

    public double getAccountNumber() {
        return this.account_number;
    }

    public double setBalance(double newBalance) {
        this.initial_balance = newBalance;
        return this.initial_balance;
    }

    public double getBalance() {
        return this.initial_balance;
    }

    public double setAccountNumber(double newAccountNumber) {
        this.account_number = newAccountNumber;
        return this.account_number;
    }
}
class Account extends AccountCreator {

    public double deposit(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        return newBalance;
    }

    public double withdraw(double amount) {
        if (getBalance() < amount) {
            System.out.println("You don't have that much money in the account. You have only Rs:\t" + getBalance());
            System.out.println("\n");
        } else {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
            if (newBalance <= 0) {
                System.out.println("You don't have enough money to withdraw");
                System.out.println("\n");
            }
        }
        return getBalance();
    }

    public void display_balance() {
        if (getBalance() <= 0)
            System.out.println("You don't have enough money to withdraw\n");
        else
            System.out.println("Total deposit amount is: Rs\t" + getBalance());
    }
}


class  FastCash {
    private  Account account;

    FastCash(Account account) {
        this.account = account;
    }
    public  void withdrawlfast(){


    }

}
public class BankingApp {
    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************Banking App************");
        Account acc = new Account();

        System.out.println("Enter your account number");
        double accNo = scanner.nextDouble();
        acc.setAccountNumber(accNo);
        System.out.println("Your account number is " + accNo);

        System.out.println("Enter your account balance");
        double accBalance = scanner.nextDouble();
        acc.setBalance(accBalance);
        System.out.println("Your account balance is " + accBalance);

        int expression;
        do {
            System.out.println("Your account number is " + acc.getAccountNumber());
            System.out.println("Total amount in account: Rs\t" + acc.getBalance());
            System.out.println("What do you want to do:\n 1 for Deposit \n 2 for withdraw  \n 3 exit()");
            System.out.println("\nEnter what you want to do? ->");
            expression = scanner.nextInt();
            switch (expression) {
                case 1:
                    System.out.println("Amount to Deposit");
                    System.out.println("\nEnter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    double newBalance = acc.deposit(depositAmount);
                    System.out.println("Amount you have right now: Rs\t" + newBalance);
                    break;
                case 2:
                    System.out.println("Amount to withdraw");
                    System.out.println("\nEnter the withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    double remainingBalance = acc.withdraw(withdrawAmount);
                    System.out.println("Amount you have right now: Rs\t" + remainingBalance);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("Exiting the application");
                    break;
                default:
                    System.out.println("You should choose the right option");
                    System.out.println("\n");
            }
        } while (expression != 3);
    }
}
