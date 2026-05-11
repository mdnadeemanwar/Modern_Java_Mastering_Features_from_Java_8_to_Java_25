package org.learnjava.paymentservicerealworldexample.domain;

public record Card(
        String cardNumber,
        String verificationCode,
        String expiaryDate,
        CardType cardType
) {
}
