public class Main {
    public static void main(String[] args) {
       Customer customer = new Customer("Tim", 1000,"tim@email.com");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getCustomerEmail());

        Customer timCustomer = new Customer("TIMMY", "Hello@email.com");
        System.out.println(timCustomer.getCustomerName());
        System.out.println(timCustomer.getCustomerEmail());
    }
}