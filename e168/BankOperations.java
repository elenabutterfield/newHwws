package hws.example.e168;

public interface BankOperations extends Transaction{

         double deposit(double amount);
         double withdraw(double amount);
         double checkBalance();
}
