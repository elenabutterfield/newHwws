package hws.example.e158;

public class E158LoanPaymentCalculator {
    public double calculatePayment(double loanAmount, double annualInterestRate){
        double payment=(loanAmount*(1+annualInterestRate/100))/12;
        return payment;
    }
    public double calculatePayment(double loanAmount, double annualInterestRate, int numberOfMonths) {
        double payment = (loanAmount * (1 + annualInterestRate / 100)) / numberOfMonths;
        return payment;
    }
    public double calculatePayment(double loanAmount, double annualInterestRate, int numberOfMonths, double downPayment) {
        double payment = ((loanAmount - downPayment) * (1 + annualInterestRate / 100)) / numberOfMonths;
        return payment;
    }
}

