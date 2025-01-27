package hierarchicalinheritance.BankingSystem;

class BankAccount {
    String accountNumber;
    double balance;

    // Constructor for BankAccount
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

