import java.util.ArrayList;

class Bank {

    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, BankAccount account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    public void displayCustomers() {
        System.out.println("Bank: " + bankName);
        System.out.println("Customers:");
        for (Customer customer : customers) {
            customer.displayCustomerDetails();
        }
    }
}

class Customer {

    String customerName;
    ArrayList<BankAccount> accounts;

    Customer(String customerName) {
        this.customerName = customerName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + customerName);
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Accounts:");
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }
    }
}

class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("City Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Create bank accounts
        BankAccount account1 = new BankAccount("123456", 5000.0);
        BankAccount account2 = new BankAccount("654321", 3000.0);
        BankAccount account3 = new BankAccount("789012", 10000.0);

        // Open accounts for customers
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // View balances for customers
        customer1.viewBalance();
        customer2.viewBalance();

        // Display all customers of the bank
        bank.displayCustomers();
    }
}
