package hierarchicalinheritance.BankingSystem;

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor for CheckingAccount
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }


    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}