package abstraction;

public class UpiPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount);
        // imagine: connect to UPI server, verify PIN, etc.
    }
}