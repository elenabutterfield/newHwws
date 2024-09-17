package hws.example.e151;

public class CheckingAccount extends E151BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (amount > 0 && (super.balance + overdraftLimit) >= amount) {
            super.balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }
}