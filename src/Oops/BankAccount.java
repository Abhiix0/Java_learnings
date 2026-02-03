package Oops;

public class BankAccount {
    // Instance variables (each object gets its own copy)
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    // Instance method: deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited to " + accountHolderName);
    }

    // Instance method: withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn from " + accountHolderName);
        } else {
            System.out.println("Insufficient balance for " + accountHolderName);
        }
    }

    // Instance method: display balance
    void displayBalance() {
        System.out.println(accountHolderName + "'s balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Abhi", 5000);
        BankAccount acc2 = new BankAccount("Aarav", 3000);

        acc1.deposit(2000);
        acc1.withdraw(1000);

        acc2.withdraw(500);

        acc1.displayBalance();  // Abhi's balance
        acc2.displayBalance();  // Aarav's balance
    }
}
