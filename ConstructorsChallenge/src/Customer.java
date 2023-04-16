public class Customer {
    private String customerName = null;
    private double creditLimit = 0;
    private String customerEmail = null;

    public Customer(){
        this("Nobody","nobody@anywhere.com");
    }
    public Customer(String customerName, String customerEmail) {
        this(customerName, 1000, customerEmail);
    }

    public Customer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }




    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }





}
