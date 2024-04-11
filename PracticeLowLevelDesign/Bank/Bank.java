package PracticeLowLevelDesign.Bank;

import java.util.HashMap;

public class Bank {
    private HashMap<Integer, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public double totalBalance() {
        double total = 0.0;
        for (Account account : accounts.values()) {
            total += account.getBalance();
        }
        return total;
    }
}
