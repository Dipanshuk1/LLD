package encapsulation;

public class BadBankAccount {

    // State is directly exposed
    public double balance;

    public BadBankAccount(double balance) {
        this.balance = balance;
    }
}