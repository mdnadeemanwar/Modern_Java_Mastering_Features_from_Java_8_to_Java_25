package org.learnjava.paymentservicerealworldexample.payment;

import org.learnjava.paymentservicerealworldexample.domain.OrderDetails;
import org.learnjava.paymentservicerealworldexample.domain.PaymentResponse;

public class PaymentService {
    public PaymentResponse makePaymentv2(OrderDetails orderDetails) {
        /*
        Impliment the payment gateway that can handle different kinds of payment
         */
        var paymentGateway = PaymentFactory.paymentGateway(orderDetails.card().cardType());
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.finalAmount());

    }
}
