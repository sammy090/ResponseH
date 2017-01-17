package TestCases;

import TestData.IV.Checkout.CheckoutHeaders;
import org.testng.annotations.Test;

public class CheckoutResponse extends CheckoutHeaders {


    @Test
    public void CheckoutResponseUS() throws Exception {

        new CheckoutResponse().CheckoutHeaderUSA();
    }

    @Test
    public void CheckoutResponseCA() throws Exception {

        new CheckoutResponse().CheckoutHeaderCanada();
    }
}
