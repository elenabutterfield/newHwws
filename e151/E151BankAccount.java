package hws.example.e151;

public class E151BankAccount {

    private String accountHolderName;
    double balance;
    private String accountNumber;

public E151BankAccount(String accountHolderName, double balance, String accountNumber){
    this.accountHolderName=accountHolderName;
    this.balance=balance;
    this.accountNumber=accountNumber;

}
public void deposit(double amount){
    if(amount>0) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        ;
    }else{
        System.out.println("Invalid deposit amount");

    }
}public void withdraw(double amount){
    if (amount >0 && balance>=amount) {
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }else{
        System.out.println("Insufficient funds or invalid withdrawal amount");
    }
    }
    public void  printAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }


}
