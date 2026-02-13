package encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {

        BadBankAccount badAccount = new BadBankAccount(1000);

        // Directly modifying state
        badAccount.balance = -5000;

        System.out.println("Bad Account Balance: " + badAccount.balance);



       GoodBankAccount goodAccount = new GoodBankAccount(1000);

       goodAccount.deposit(500);
       goodAccount.withdraw(300);

       System.out.println("Good Account Balance: " + goodAccount.getBalance());
    }
}