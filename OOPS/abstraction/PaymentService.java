package abstraction;

public class PaymentService {

    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(double amount) {
        System.out.println("Starting payment...");
        paymentProcessor.pay(amount);
        System.out.println("Payment completed.");
    }
}