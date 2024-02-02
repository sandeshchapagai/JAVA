public class Account {
    public double accountNumber;
    public double bankBalance = 0;

    double deposit(double amount) {
        bankBalance = bankBalance + amount;
        return bankBalance;
    }

    double withdraw(double amount) {
        if (bankBalance  < amount){
            System.out.println("You have not that much money in account you have only Rs:\t"+bankBalance);
            System.out.println("\n");
        }
        else {

            bankBalance = bankBalance - amount;
            if (bankBalance <= 0) {
                System.out.println("You have not enough money to withdraw");
                System.out.println("\n");
            }
        }
        return bankBalance;
    }

    void display_balance() {
        if(bankBalance<=0)
            System.out.println("You have not enough money to withdraw\n");
        else
            System.out.println("Total deposite amount is :\t" + bankBalance);
    }
}
