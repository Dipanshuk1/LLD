package org.example.solid.ocp;

public class BadPaymentService {

    public void processPayment(String type, double amount) {

        if (type.equalsIgnoreCase("CREDIT")) {
            System.out.println("Processing credit card payment: " + amount);
        } else if (type.equalsIgnoreCase("UPI")) {
            System.out.println("Processing UPI payment: " + amount);
        } else if (type.equalsIgnoreCase("NETBANKING")) {
            System.out.println("Processing net banking payment: " + amount);
        } else {
            System.out.println("Invalid payment type");
        }
    }
}
