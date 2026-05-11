package org.learnjava.paymentservicerealworldexample.service;

import org.learnjava.paymentservicerealworldexample.domain.CheckOutStatus;
import org.learnjava.paymentservicerealworldexample.domain.OrderDetails;
import org.learnjava.paymentservicerealworldexample.domain.PaymentResponse;
import org.learnjava.paymentservicerealworldexample.payment.PaymentService;

public class CheckoutService {

    public final PaymentService paymentService;
    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public CheckOutStatus checkout(OrderDetails orderDetails) {
        var paymentResponse = paymentService.makePaymentv2(orderDetails);

        if (paymentResponse.equals(PaymentResponse.SUCCESS)) { //  compare same type
            return CheckOutStatus.SUCCESS;
        }
        return CheckOutStatus.FAILED;
    }
}
