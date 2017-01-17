package TestCases;

import TestData.IV.HomePage.HomePageHeaders;
import org.testng.annotations.Test;

public class HomePageResponse extends HomePageHeaders {

    @Test
    public void HomePageResponseCA() throws Exception {

        new HomePageResponse().HomePageResponseForCanada();
    }


    @Test
    public void HomePageResponseUS() throws Exception {

        new HomePageResponse().HomePageResponseForUSA();
    }

    @Test
    public void TestHime() throws Exception {

    }

}







