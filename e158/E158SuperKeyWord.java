package hws.example.e158;

public class E158SuperKeyWord {
    public static void main(String[] args) {
        E158LoanPaymentCalculator calculator = new E158LoanPaymentCalculator();
        double payment1 = calculator.calculatePayment(10000, 5);
        System.out.println("Monthly Payment (12 months): $" + payment1);

        double payment2 = calculator.calculatePayment(10000, 5, 24);
        System.out.println("Monthly Payment (24 months): $" + payment2);

        double payment3 = calculator.calculatePayment(10000, 5, 24, 2000);
        System.out.println("Monthly Payment (24 months with down payment): $" + payment3);
    }
}
