public class Account extends AccountCreator{
    public double initial_balance = 0;

    double Account_details(double y){
        setBalance(y);
        initial_balance=getAccountNumber();
        return  initial_balance;
    }


    double deposit(double amount) {
        initial_balance = initial_balance + amount;
        return initial_balance;
    }

    double withdraw(double amount) {
        if (initial_balance < amount){
            System.out.println("You have not that much money in account you have only Rs:\t"+ initial_balance);
            System.out.println("\n");
        }
        else {

            initial_balance = initial_balance - amount;
            if (initial_balance <= 0) {
                System.out.println("You have not enough money to withdraw");
                System.out.println("\n");
            }
        }
        return initial_balance;
    }

    void display_balance() {
        if(initial_balance <=0)
            System.out.println("You have not enough money to withdraw\n");
        else
            System.out.println("Total deposite amount is :\t" + initial_balance);
    }
}
