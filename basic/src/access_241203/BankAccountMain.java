package access_241203;

public class BankAccountMain {
    public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(10000);
    account.withdraw(3000);
        System.out.println(" 현재 잔액 = " + account.getBalance() + "원");
    }
}