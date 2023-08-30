package Lec40.OOPs2;

public class AdminUser extends User {

    boolean isAdmin;
    public AdminUser(String name, String email, Boolean isAdmin){
        super(name, email);
        this.isAdmin = isAdmin;
    }

    public static void main(String[] args) {
        SavingsAccount sb = new SavingsAccount("3466456457", 463463.64567, true);
        System.out.println(sb.getBalance());
        sb.savingsAccount();
        sb.currentAccount();
    }
}
