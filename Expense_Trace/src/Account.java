public class Account extends AccountCreator{

   double bb = getBalance();
    public double deposit(double amount) {
        double bb = getBalance() + amount;
        return bb;
    }

    double withdraw(double amount) {
        if (getBalance() < amount){
            System.out.println("You have not that much money in account you have only Rs:\t"+ getBalance());
            System.out.println("\n");
        }
        else {

           double yy = getBalance() - amount;
            if (getBalance() <= 0) {
                System.out.println("You have not enough money to withdraw");
                System.out.println("\n");
            }
        }
        return bb;
    }

    void display_balance() {
        if(getBalance() <=0)
            System.out.println("You have not enough money to withdraw\n");
        else
            System.out.println("Total deposite amount is :\t" + getBalance());
    }
}
