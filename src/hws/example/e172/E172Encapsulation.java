package hws.example.e172;

public class E172Encapsulation {
    public static void main(String[] args){

      Customer customer=new Customer(1234567890L, "Sarah Connor", "sarah.connor@example.com", 15000.0);

        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Full Name: " + customer.getFullName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Balance: " + customer.getBalance());

    }

}


