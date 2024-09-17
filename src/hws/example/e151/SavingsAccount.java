package hws.example.e151;

public class SavingsAccount extends E151BankAccount {
    private double interestRate;
    public SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate) {
        super(accountHolderName, balance, accountNumber);
        this.interestRate = interestRate;
    }
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Applied interest: " + interest);
    }
    private double getBalance() {
        return super.balance;
    }
}

