package encapsulation;

public class GoodBankAccount {

    // State is protected
    private double balance;

    public GoodBankAccount(double initialBalance) {
        //
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal attempt");
        }
    }

    public double getBalance() {
        return balance;
    }
}