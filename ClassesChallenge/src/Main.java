public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.withdrawal(100.0);
        account.deposit(1000);
        account.withdrawal(100.0);
        account.withdrawal(900);
        account.deposit(100);
        account.withdrawal(45.55);
        account.withdrawal(54.46);
        account.withdrawal(54.45);
        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo:" + timsAccount.getAccountNumber() + "; name" + timsAccount.getCustomerName());
    }
}