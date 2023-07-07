public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts=0;
    private static double totalMoney=0.0; // refers to the sum of all bank account checking and savings balances

    public BankAccount() {
        this.checkingBalance=0.0;
        this.savingsBalance=0.0;
        numberOfAccounts++;

    }
    
    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        System.out.println("Your Checking Balance = " +this.checkingBalance);
        return checkingBalance;
    }
    public double getSavingsBalance() {
        System.out.println("Your Saving Balance = " +this.savingsBalance);
        return savingsBalance;
    }
        public double getTotalMoneyInTheAccount() {
            double totalMoneyInTheAccount=this.savingsBalance+this.checkingBalance;
        System.out.println("Total money in the bank = " +totalMoneyInTheAccount);
        return totalMoneyInTheAccount;
        }
    public static double getTotalMoney() {
        System.out.println("Total money in the bank = " +totalMoney);
        return totalMoney;
    }
    public static int getNumberOfAccounts() {
        System.out.println("Total Accounts in the bank = "+numberOfAccounts);
        return numberOfAccounts;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings
    // account
    public void setCheckingBalance(double amount) {
        this.checkingBalance += amount;
        totalMoney += amount;
        System.out.println("Sucessfully added to Checking account");
    }
    public void setSavingsBalance(double amount) {
        this.savingsBalance += amount;
        totalMoney += amount;
        System.out.println("Sucessfully added to Savings account");
    }

    // withdraw
    public void withdrawCheckingBalance(double amount){
        this.checkingBalance -= amount;
        totalMoney -= amount;
        System.out.println("Sucessfully withdarwed to Checking account");
    }

    public void withdrawSavingBalance(double amount){
        this.savingsBalance -= amount;
        totalMoney -= amount;
        System.out.println("Sucessfully withdarwed to Saving account");
    }
    // - users should be able to withdraw money from their checking or savings
    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
}
