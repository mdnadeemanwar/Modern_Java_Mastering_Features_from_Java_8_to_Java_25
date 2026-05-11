package org.learnjava.paymentservicerealworldexample;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.learnjava.paymentservicerealworldexample.domain.*;
import org.learnjava.paymentservicerealworldexample.payment.PaymentService;
import org.learnjava.paymentservicerealworldexample.service.CheckoutService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutServiceTest {


    PaymentService paymentService = new PaymentService();
    CheckoutService checkoutService = new CheckoutService(paymentService);

    @EnumSource(CardType.class)
    @ParameterizedTest(name = "checkout for card type :{0}")
    public void checkoutForCardType(CardType cardType) {
        var orderDetails = orderDetails(cardType);
       var response = checkoutService.checkout(orderDetails);
       assertEquals(CheckOutStatus.SUCCESS,response);
    }


    static OrderDetails orderDetails (CardType cardType) {
        var card = new Card("78987987789789687968", "76", "09/31", cardType);
        return new OrderDetails(card, 4500);
    }


}
