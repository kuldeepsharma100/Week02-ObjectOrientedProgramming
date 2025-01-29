package problemstatements.bankingsystem;
import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        // Creating accounts
        SavingsAccount savingsAccount = new SavingsAccount("ss343", "ram", 3545);
        CurrentAccount currentAccount = new CurrentAccount("gjkj345", "raj", 45466, 35463);

        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Processing accounts
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(10000);
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}

