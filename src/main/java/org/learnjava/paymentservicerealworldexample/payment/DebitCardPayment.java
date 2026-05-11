package org.learnjava.paymentservicerealworldexample.payment;

import org.learnjava.paymentservicerealworldexample.domain.Card;
import org.learnjava.paymentservicerealworldexample.domain.PaymentResponse;

public final class DebitCardPayment extends PaymentGateway {

    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Get DebitCardPayment  -> " + card);
        return PaymentResponse.SUCCESS;
    }
}
