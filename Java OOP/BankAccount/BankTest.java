public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1= new BankAccount();
        BankAccount account2= new BankAccount();
        BankAccount account3= new BankAccount();
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        account1.setCheckingBalance(100);
        account1.setSavingsBalance(300);
        account2.setCheckingBalance(1000);
        account2.setSavingsBalance((5000));
        account3.getCheckingBalance();
        account1.getCheckingBalance();
        account1.getSavingsBalance();
        BankAccount.getTotalMoney();
        BankAccount.getNumberOfAccounts();
        account1.getTotalMoneyInTheAccount();
        // - each deposit should increase the amount of totalMoney

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        // Static Test (print the number of bank accounts and the totalMoney)

    }
}
