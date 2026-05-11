package org.learnjava.paymentservicerealworldexample.payment;

import org.learnjava.paymentservicerealworldexample.domain.Card;
import org.learnjava.paymentservicerealworldexample.domain.PaymentResponse;

public sealed abstract class PaymentGateway permits
        DebitCardPayment,
        CreditCardPayment,
        RewardCardPayment {

    //Created one abstract method for payment take 2 argument card and amount
    public abstract PaymentResponse makePayment(Card card, double amount);

}
