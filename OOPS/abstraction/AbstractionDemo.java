package abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {

        PaymentProcessor creditCard = new CreditCardPayment();
        PaymentService service1 = new PaymentService(creditCard);
        service1.processOrder(2000);

        System.out.println("-------------------");

        PaymentProcessor upi = new UpiPayment();
        PaymentService service2 = new PaymentService(upi);
        service2.processOrder(1500);
    }
}