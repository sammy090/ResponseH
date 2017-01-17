package TestCases;


import TestData.IV.PDP.PDPHeaders;
import org.testng.annotations.Test;

public class PDPResponse extends PDPHeaders {

    @Test
    public void PDPResponseCA() throws Exception {

        new PDPResponse().PDPHeaderCanada();
    }


    @Test
    public void PDPResponseUS() throws Exception {

        new PDPResponse().PDPHeaderUSA();
    }
}
