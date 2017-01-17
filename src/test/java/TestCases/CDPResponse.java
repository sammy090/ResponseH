package TestCases;

import TestData.IV.CDP.CDPHeaders;
import org.testng.annotations.Test;

import java.net.UnknownHostException;


public class CDPResponse extends CDPHeaders {



    @Test
    public void CDPResponseCA() throws Exception {

        new CDPResponse().CDPHeaderCanada();
    }

    @Test
    public void CDPResponseUS() throws Exception {

        new CDPResponse().CDPHeaderUSA();
    }
}
