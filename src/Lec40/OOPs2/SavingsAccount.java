package Lec40.OOPs2;

public class SavingsAccount extends BankAccount {
    boolean isSavings;

    SavingsAccount(String accountNumber, double balance, boolean isSavings){
        super(accountNumber, balance);
        this.isSavings = isSavings;
    }
    public void savingsAccount(){
        System.out.println("This is savings account");
    }

    public void currentAccount(){
        System.out.println("This is savings account");
    }
}
