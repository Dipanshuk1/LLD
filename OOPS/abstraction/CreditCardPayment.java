package abstraction;
public class CreditCardPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of " + amount);
        // imagine: validate card, talk to bank gateway, etc.
    }
}