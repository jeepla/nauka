public class BankAccount {
    private String accountNumber = "";
    private double accountBalance = 0;
    private String customerName = "";
    private String email = "";
    private String phoneNumber = "";

    public BankAccount() {
        this("56789", 2.50, "Default name", "default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositedValue) {
        accountBalance += depositedValue;
        System.out.println("You deposited=" + depositedValue + "$. New balance is $" + accountBalance);
    }

    public void withdrawal(double withdrewValue) {
        if (accountBalance - withdrewValue < 0) {
            System.out.println("You don't have enough Funds. Your current balance is =" + accountBalance);
        } else {
            accountBalance -= withdrewValue;
            System.out.println("You withdrew" + withdrewValue + "$. New balance is $" + accountBalance);

        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}

