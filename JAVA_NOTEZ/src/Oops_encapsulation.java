import java.awt.geom.Arc2D;

public class Oops_encapsulation {
    static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(1000);

        account.deposit(500);
        account.withdraw(200);

        System.out.println(account.getBalance());
    }
    static class BankAccount {
        private double balance;

        public void deposit (double amount){
            if (amount > 0 ){
                balance += amount ;
            }

        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount){
            if (amount > 0 && amount <= balance){
                balance -= amount ;
            }
        }

        public double getBalance() {
            return balance;
        }
    }
}
