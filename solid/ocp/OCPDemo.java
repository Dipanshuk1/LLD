package org.example.solid.ocp;

public class OCPDemo {

    public static void main(String[] args) {

        BadPaymentService service = new BadPaymentService();

        service.processPayment("CREDIT", 2000);
        service.processPayment("UPI", 1500);
    }
}
