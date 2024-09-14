package hws.example.e160;

public class E160BankAccount {

    private void displayInfo() {
        System.out.println("private displayInfo method");
    }

    private void displayInfo(int balance) {
        System.out.println("private displayInfo method with balance: " + balance);
    }

    public static void displayBankInfo() {
        System.out.println("static method without parameter");
    }

    public static void displayBankInfo(int branches) {
        System.out.println("static method with int parameter: " + branches);
    }

    public static void main(String[] args) {
        E160BankAccount account = new E160BankAccount();


        account.displayInfo();
        account.displayInfo(5000);

        E160BankAccount.displayBankInfo();
        E160BankAccount.displayBankInfo(20);
    }

}
