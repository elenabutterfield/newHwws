package hws.example.e168;

public class BankAccount implements BankOperations {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double deposit(double amount) {
        balance += amount;
        processTransaction(amount);
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            processTransaction(-amount);
            return balance;
        } else {
            System.out.println("Transaction failed: Insufficient funds");
            return balance;
        }
    }
    public double checkBalance() {
        return balance;
    }
    public void processTransaction(double amount) {
        if (amount > 0) {
            System.out.println("Transaction successful: Deposited " + amount);
        } else {
            System.out.println("Transaction successful: Withdrew " + (-amount));
        }
    }
}