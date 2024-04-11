package PracticeLowLevelDesign.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(1);
        Account account2 = new Account(2);

        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(1000.0); // You'll implement deposit method
        account2.deposit(500.0);

        account1.withdraw(200.0); // You'll implement withdraw method

        System.out.println("Account 1 Balance: " + account1.getBalance()); // You'll implement getBalance method
        System.out.println("Account 2 Balance: " + account2.getBalance());

        System.out.println("Total Bank Balance: " + bank.totalBalance());
    }
}

