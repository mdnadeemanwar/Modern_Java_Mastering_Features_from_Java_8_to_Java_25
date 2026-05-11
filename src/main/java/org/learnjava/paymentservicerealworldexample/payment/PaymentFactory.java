package org.learnjava.paymentservicerealworldexample.payment;

import org.learnjava.paymentservicerealworldexample.domain.CardType;

public class PaymentFactory {


    public static PaymentGateway paymentGateway(CardType cardType) {

        return switch (cardType) {
            case CREDIT_CARD -> new CreditCardPayment();
            case DEBIT_CARD -> new DebitCardPayment();
            case REWARD_CARD -> new RewardCardPayment();
            case null, default -> throw new IllegalArgumentException("Unknown card type: " + cardType);
        };
    }
}
