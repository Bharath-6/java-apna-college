package PracticeLowLevelDesign.Bank;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // You'll code deposit, withdraw, and getBalance methods here
    // deposit(), withdraw(), getBalance()
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance = balance - amount;
            System.out.println("The amount withdrawed "+amount+" and Balance is "+balance);
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Deposited "+amount+" the total balance is "+balance);
        }
    }
    public int getAccountNumber(){
        return accountNumber;
    }
}

