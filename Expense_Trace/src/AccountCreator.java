public class AccountCreator {
    private int account_number = 0;
    private int inital_balance = 0;

    public double getAccountNumber() {

        return this.account_number;
    }

    public double setBalance(int inital_balance, int newBalance) {
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
