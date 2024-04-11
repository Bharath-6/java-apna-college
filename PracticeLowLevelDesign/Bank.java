package PracticeLowLevelDesign;

import java.util.*;

class SbiBank {
    int account_number;
    String account_holder;
    int account_balance;

    public SbiBank(int account_number, String account_holder, int account_balance) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.account_balance = account_balance;
    }

    public void deposit(int amount) {
        this.account_balance = amount + account_balance;
        System.out.println("Deposit Amount: " + amount);

    }

    public void withdraw(int amount) {
        this.account_balance = Math.abs(amount - account_balance);
        System.out.println("Amount withdrawed");
    }

    public void overview() {
        System.out.println("Account_Number: " + account_number);
        System.out.println("Account_holder: " + account_holder);
        System.out.println("Account_balance: " + account_balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        SbiBank b = new SbiBank(99664, "Bharath", 10000);
        b.deposit(200);
        b.withdraw(5000);
        b.overview();
    }

}
