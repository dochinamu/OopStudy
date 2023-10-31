public class hw4_01 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100.0);
        BankAccount account2 = new BankAccount(200.0);

        account1.deposit(50.0);
        account2.deposit(100.0);

        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());

        System.out.println("Total bank balance: " + BankAccount.getTotalBalance());
    }
}

// your code here
class BankAccount {
    private static double total;
    private double balance;

    public BankAccount() {
        balance = 0;
    }
    public BankAccount(double balance) {
        this.balance = balance;
        total += balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
        total += amount;
    }
    public double getBalance() {
        return balance;
    }

    public static double getTotalBalance() {
        return total;
    }
}


