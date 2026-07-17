package com.zaid.lld.patterns.observer.bad;

public class OrderService {

    private final EmailService emailService = new EmailService();
    private final SmsService smsService = new SmsService();
    private final InvoiceService invoiceService = new InvoiceService();

    public void placeOrder() {

        System.out.println("Order placed successfully.");

        emailService.sendEmail();
        smsService.sendSms();
        invoiceService.generateInvoice();

    }

}
