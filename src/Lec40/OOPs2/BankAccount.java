package Lec40.OOPs2;

public abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected double getBalance(){
        return this.balance;
    }

    protected abstract void savingsAccount();
    protected abstract void currentAccount();
}
