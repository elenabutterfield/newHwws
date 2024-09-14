package hws.example.e151;

public class E151Inheritance {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", 1000.0, "SA123", 5.0);
        savings.printAccountInfo();
        savings.deposit(500.0);
        savings.applyInterest();
        savings.printAccountInfo();

        CheckingAccount checking = new CheckingAccount("Bob", 500.0, "CA456", 200.0);
        checking.printAccountInfo();
        checking.withdraw(600.0);
        checking.printAccountInfo();
        checking.withdraw(200.0);
    }
    }

