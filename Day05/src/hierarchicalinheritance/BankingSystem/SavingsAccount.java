package hierarchicalinheritance.BankingSystem;

class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

