public class AccountCreator {
    private int account_number = 0;
    private double inital_balance = 0;

    public double getAccountNumber() {

        return this.account_number;
    }

    public double setBalance(double newBalance) {
        this.inital_balance = newBalance;
        return this.inital_balance;
    }

    public double getBalance() {

        return this.inital_balance;
    }

    public double setAccountNumber(int account_number, int newacc_number) {
        this.account_number = newacc_number;
        return this.account_number;
    }
}
