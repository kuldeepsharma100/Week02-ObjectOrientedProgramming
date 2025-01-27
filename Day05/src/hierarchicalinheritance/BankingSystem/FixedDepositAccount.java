package hierarchicalinheritance.BankingSystem;

class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // In months

    // Constructor for FixedDepositAccount
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }


    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

