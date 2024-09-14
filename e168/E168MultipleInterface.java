package hws.example.e168;

public class E168MultipleInterface {

    public static void main(String[] args){
        BankAccount account = new BankAccount(0);

        account.deposit(100.0);
        account.withdraw(50.0);
        System.out.println("Current Balance: " + account.checkBalance());
        account.withdraw(100.0);
    }
    }
