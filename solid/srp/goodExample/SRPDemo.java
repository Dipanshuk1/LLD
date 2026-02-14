package org.example.solid.srp.goodExample;

public class SRPDemo {

    public static void main(String[] args) {

        GoodInvoiceService invoiceService = new GoodInvoiceService();
        InvoicePrinter printer = new InvoicePrinter();
//        InvoiceRepository repository = new InvoiceRepository();

        invoiceService.calculateTotal();
        printer.print();
//        repository.save();
    }
}
