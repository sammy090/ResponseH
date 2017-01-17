package TestData.IV.Checkout;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.Assert;
import org.testng.Reporter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class CheckoutHeaders  {




    public void CheckoutHeaderUSA() throws Exception {

        //Logged in User
        URL obj = new URL("https://www.ivivva.com/checkout/spk/index.jsp");
        URLConnection conn = obj.openConnection();
        Reporter.log("Started passTest");

        conn.setRequestProperty("Host", "www.ivivva.com");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
        conn.setRequestProperty("Cookie", "JSESSIONID=EAEDFEBB0067900B8030AB0D151F1602; UsrLocale=en_US; Country=US; ca_ord=M0KiyfhTOWEjSZhHAmnNTQ==; isLoggedin=true; cartCount=0; NSC_mvmvmfnpo_jwjwwb_qspew10_mc=ffffffff09c943d645525d5f4f58455e445a4a42168c; ak_bmsc=9C6B3892CDCC39710690350506C16C27D1087066243600009B567558A5CE0A1C~pl7i/wNqivaNRlh7SMq23QPePWfwFOuVsfnk8Ux4lflcYESecOB0l2mabXPKy7WtZWl1oo4d3NWaRveBXruHsG63WRY5dmrV17ZJFb40qd+Vh0b7FyTJt4Xkv9uW0wXU7Mj7TM45baNr1SGnOBsTktiwy7YCLsNY7vpMykOebg+xu96TZE25YnduBq8/qv0ormxsKank4kHkMv0sDkdzI2pA==; akavpau_vp_ivivva_www=1484086463~id=eed484d56db57e1c089b304fdbf5ff95; omniID=14840848921697EyA; mbox=session#1484084892184-278463#1484088021|check#true#1484086221; __utma=210616138.738838571.1484084892.1484084892.1484084892.1; __utmb=210616138.52.8.1484086162429; __utmc=210616138; __utmz=210616138.1484084892.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); sandy-session-id=7b7660426d94b580; sandy-client-id=63368a36b2834c62; _ga=GA1.2.738838571.1484084892; s_cc=true; s_fid=7C3C889A379CABAB-050D90B828AF871A; c_m2=1; c_m=undefinedwww.ivivva.comwww.ivivva.com; s_nr=1484086162455; s_vnum=1486676893697%26vn%3D1; s_invisit=true; s_lv=1484086162457; s_lv_s=First%20Visit; s_sq=%5B%5BB%5D%5D; BTT_X0siD=284119823338783106; BTT_Collect=on; sl=US; s_vi=[CS]v1|2C3AAB4E851D060F-4000014BC0082696[CE]; BTT_WCD_Collect=off; emailSignupCDPCookie=true; NSC_JOor3tnbcwc1l2hdtpjjr5dyiriurdc=ffffffff09c943d845525d5f4f58455e445a4a423660; userPrefLanguage=en_US; _gat_mobifyTracker=1; __utmt_ga=1; xdVisitorId=11C9XyotQVV_ls0EHXYvmPWNG0R05GyqpTJagfaOXTimq748F6E; atgRecVisitorId=11C9XyotQVV_ls0EHXYvmPWNG0R05GyqpTJagfaOXTimq748F6E; atgPlatoStop=1; regionMsgShown=true; us_ord=X8JyeKSASqnG+cP4QiY5+A==");
        conn.setRequestProperty("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-check-cacheable, akamai-x-get-cache-key, akamai-x-get-extracted-values, akamai-x-get-nonces, akamai-x-get-ssl-client-session-id, akamai-x-get-true-cache-key, akamai-x-serial-no");
        conn.setRequestProperty("Connection", "keep-alive");
        //conn.setRequestProperty("Referer", "https://www.ivivva.com/secure/account/login-checkout-success.jsp?_requestid=437401");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Cache-Control", "max-age=0");
        Map<String, List<String>> map = conn.getHeaderFields();
        System.out.println("Printing Response Header...\n");

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " ,Value : " + entry.getValue());
        }

        Assert.assertEquals("NO", conn.getHeaderField("X-Check-Cacheable"));
        Assert.assertEquals("S/D/8125/250672/000/www.ivivva.com/checkout/spk/index.jsp", conn.getHeaderField("X-Cache-Key"));
    }

    public void CheckoutHeaderCanada() throws Exception {

        //Logged in User
        URL obj = new URL("https://www.ivivva.com/checkout/spk/index.jsp");
        URLConnection conn = obj.openConnection();

        conn.setRequestProperty("GET", "/checkout/spk/index.jsp HTTP/1.1");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Cookie", "JSESSIONID=FEA891D95A4E156B00424CB501C562EE; UsrLocale=en_CA; Country=CA; ca_ord=uPJIaKEbL3GMh9grzZyaJw==; isLoggedin=true; cartCount=1; NSC_mvmvmfnpo_jwjwwb_qspew10_mc=ffffffff09c943d845525d5f4f58455e445a4a4229a0; ak_bmsc=58F770345FF8CB0A594E232E4177F1B9D10870639F65000011177958EA5C0E24~pldamUgmNTqLX85Hjcv4SEg1jKEbmR940IthEY9iIN6HOVvg02bronLQCsJ79/Pj1EGOOsLhXgZHiLXFFKDivl0RgJwVRWy9MHMcsea9fomjxzxQE21Acyk7zBL4DOq4cLhgi+2+EhAG+VBatLbwF50xvYgAtxeo/KZEjBZkCAIpmVv8QKmc2cahWSQK2anUECTfQGnElZCw9W4h+wNV/Bug==; akavpau_vp_ivivva_www=1484331120~id=6c3d9b433a4e57fcb73e9ec7547d8abf; omniID=14843307698335U42; mbox=check#true#1484330879|session#1484330769846-357710#1484332679; s_cc=true; s_fid=1DB8C6F7FFA74925-3AEA4B806C481A5B; c_m2=1; c_m=undefinedDirect%20LoadDirect%20Load; s_nr=1484330819833; s_vnum=1486922770180%26vn%3D1; s_invisit=true; s_lv=1484330819834; s_lv_s=First%20Visit; s_sq=%5B%5BB%5D%5D; BTT_X0siD=525514976474783441; BTT_Collect=on; sandy-session-id=8f70f9d076d20170; sandy-client-id=62d1d11142fd09b7; sl=CA; s_vi=[CS]v1|2C3C8B89051D1C56-40001903A007BEEA[CE]; __utma=210616138.2059121467.1484330771.1484330771.1484330771.1; __utmb=210616138.21.8.1484330819843; __utmc=210616138; __utmz=210616138.1484330771.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt_ga=1; _ga=GA1.2.2059121467.1484330771; _gat_mobifyTracker=1; BTT_WCD_Collect=off; emailSignupCDPCookie=true; NSC_JOor3tnbcwc1l2hdtpjjr5dyiriurdc=ffffffff09c943d845525d5f4f58455e445a4a423660; userPrefLanguage=en_CA");
        //conn.setRequestProperty("Referer", "https://www.ivivva.com/secure/account/login-checkout-success.jsp?_requestid=437401");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-check-cacheable, akamai-x-get-cache-key, akamai-x-get-extracted-values, akamai-x-get-nonces, akamai-x-get-ssl-client-session-id, akamai-x-get-true-cache-key, akamai-x-serial-no");
        conn.setRequestProperty("Cache-Control", "max-age=0");

        Map<String, List<String>> map = conn.getHeaderFields();
        System.out.println("Printing Response Header...\n");

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " ,Value : " + entry.getValue());
        }

        Assert.assertEquals("NO", conn.getHeaderField("X-Check-Cacheable"));
        Assert.assertEquals("S/D/8125/250672/000/www.ivivva.com/checkout/spk/index.jsp", conn.getHeaderField("X-Cache-Key"));

    }

}
