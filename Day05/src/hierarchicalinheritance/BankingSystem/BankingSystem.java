package hierarchicalinheritance.BankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000.0, 3.5);
        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountDetails();
        System.out.println();

        // Creating a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("CA67890", 2000.0, 1000.0);
        System.out.println("Checking Account Details:");
        checkingAccount.displayAccountDetails();
        System.out.println();

        // Creating a FixedDepositAccount object
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD11223", 10000.0, 12);
        System.out.println("Fixed Deposit Account Details:");
        fixedDepositAccount.displayAccountDetails();
    }
}

