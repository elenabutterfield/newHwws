package hws.example.e170;

public class StoreManagement {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setCustomerName("Mario");
        customer.setCustomerAge(32);

        System.out.println("Customer name: " +customer.getCustomerName());
        System.out.println("Customer age: "+customer.getCustomerAge());
    }

}
