package problemstatements.bankingsystem;

interface Loanable {
    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}
