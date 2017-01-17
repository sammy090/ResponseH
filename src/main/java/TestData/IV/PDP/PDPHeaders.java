package TestData.IV.PDP;



import org.testng.Assert;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class PDPHeaders {


    public void PDPHeaderCanada() throws Exception {


        URL obj = new URL("http://www.ivivva.com/products/clothes-accessories/girls-hoodies/perfect-your-practice-jacket?cc=24272&skuId=ca_3660234&catId=girls-hoodies");
        URLConnection conn = obj.openConnection();

        conn.setRequestProperty("Host", "www.ivivva.com");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        conn.setRequestProperty("Cookie", "JSESSIONID=50C9644A2EEC4CB4220569558249A8E3; UsrLocale=en_CA; Country=CA; ca_ord=M0KiyfhTOWGLqmgzqfBfvg==; isLoggedin=false; cartCount=0; NSC_mvmvmfnpo_jwjwwb_qspew10_mc=ffffffff09c943d845525d5f4f58455e445a4a4229a0; ak_bmsc=1AB782B5B49359A6180CAAFC150113EED1087066243600004C3175587F82DD7D~plNA8A+/tnx5uR1p9TZ3mfxGMMwOBnuZBH60oZcoOlck/5V1mmJu88I17QdhmFOwN+fn7AykRd20mo4VnsWzSM5+Jr7TAABmsv/hws2vJ4mAjaituZk1fvign61EYaPyFwBqITENne13pdkA4OZM4CSjzbhtrkHljknRxhmfG0dJiif69dgrh1t5kttMt0gwjpaaLqBQaBaGFZrWCLejVdcw==; akavpau_vp_ivivva_www=1484076360~id=73349fc560c5d5456c8dce8f9705d60a; omniID=1484075341186RonF; mbox=session#1484075341202-564402#1484077922|check#true#1484076122; s_cc=true; s_fid=0D443209ACD37E25-3FFDDFA75CAF85F4; c_m2=1; c_m=undefinedDirect%20LoadDirect%20Load; s_nr=1484076062645; s_vnum=1486667341771%26vn%3D1; s_invisit=true; s_lv=1484076062647; s_lv_s=First%20Visit; s_sq=%5B%5BB%5D%5D; BTT_X0siD=684101141324130750; BTT_Collect=on; sandy-session-id=f7aa2d0111575cf2; sandy-client-id=b59c8c61219bf737; _ga=GA1.2.2037417868.1484075342; sl=CA; __utma=210616138.2037417868.1484075342.1484075343.1484075343.1; __utmb=210616138.23.8.1484076061841; __utmc=210616138; __utmz=210616138.1484075343.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); s_vi=[CS]v1|2C3A98A7051D2D12-4000012CC00278E9[CE]; BTT_WCD_Collect=off; regionMsgShown=true; us_ord=X8JyeKSASqn32kS5b5qndw==; NSC_JOor3tnbcwc1l2hdtpjjr5dyiriurdc=ffffffff09c943d845525d5f4f58455e445a4a423660; emailSignupCDPCookie=true; userPrefLanguage=en_CA; _gat_mobifyTracker=1; __utmt_ga=1");
        conn.setRequestProperty("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-check-cacheable, akamai-x-get-cache-key, akamai-x-get-extracted-values, akamai-x-get-nonces, akamai-x-get-ssl-client-session-id, akamai-x-get-true-cache-key, akamai-x-serial-no");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Cache-Control", "max-age=0");
        Map<String, List<String>> map = conn.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " ,Value : " + entry.getValue());
        }
        Assert.assertEquals("YES", conn.getHeaderField("X-Check-Cacheable"));
        Assert.assertEquals("/L/8125/250672/15m/www.ivivva.com/products/clothes-accessories/girls-hoodies/perfect-your-practice-jacket cid=cc=24272&skuId=ca_3660234&catId=girls-hoodies_UsrLocale=en_CA&Country=CA&cartCount=0_", conn.getHeaderField("X-Cache-Key"));
    }


    public void PDPHeaderUSA() throws Exception {


        URL obj = new URL("http://www.ivivva.com/products/clothes-accessories/girls-hoodies/perfect-your-practice-jacket?cc=24272&skuId=us_3660234&catId=girls-hoodies");
        URLConnection conn = obj.openConnection();

        conn.setRequestProperty("Host", "www.ivivva.com");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        conn.setRequestProperty("Cookie", "JSESSIONID=50C9644A2EEC4CB4220569558249A8E3; UsrLocale=en_US; Country=US; ca_ord=M0KiyfhTOWGLqmgzqfBfvg==; isLoggedin=false; cartCount=0; NSC_mvmvmfnpo_jwjwwb_qspew10_mc=ffffffff09c943d845525d5f4f58455e445a4a4229a0; ak_bmsc=1AB782B5B49359A6180CAAFC150113EED1087066243600004C3175587F82DD7D~plqP4R7t8AThe/np++zCtF5ACUcSapqABIjnCjs/A3YrHNtCSnLP28vMum902iyO8SY/ZGI4WY1V2Pwt8QossrVflh8wpt2jH3kfaCDm913b0LSNK7YPMJUgKoDaPjogzcwOpjr34o210iTfmzNW76ATuVAO66DeX5b5IAIE2fn9h9bwYmUAFiQ8TOFDDEVl+RGciXANrhusGmAhyIk21VVw==; akavpau_vp_ivivva_www=1484075714~id=1399a515d4b6c0320f7ece55a1e81940; omniID=1484075341186RonF; mbox=check#true#1484075474|session#1484075341202-564402#1484077274; s_cc=true; s_fid=0D443209ACD37E25-3FFDDFA75CAF85F4; c_m2=1; c_m=undefinedDirect%20LoadDirect%20Load; s_nr=1484075418722; s_vnum=1486667341771%26vn%3D1; s_invisit=true; s_lv=1484075418724; s_lv_s=First%20Visit; s_sq=%5B%5BB%5D%5D; BTT_X0siD=684101141324130750; BTT_Collect=on; sandy-session-id=f7aa2d0111575cf2; sandy-client-id=b59c8c61219bf737; _ga=GA1.2.2037417868.1484075342; _gat_mobifyTracker=1; sl=US; __utma=210616138.2037417868.1484075342.1484075343.1484075343.1; __utmb=210616138.9.8.1484075414270; __utmc=210616138; __utmz=210616138.1484075343.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt_ga=1; s_vi=[CS]v1|2C3A98A7051D2D12-4000012CC00278E9[CE]; BTT_WCD_Collect=off; regionMsgShown=true; us_ord=X8JyeKSASqn32kS5b5qndw==; NSC_JOor3tnbcwc1l2hdtpjjr5dyiriurdc=ffffffff09c943d845525d5f4f58455e445a4a423660; emailSignupCDPCookie=true; userPrefLanguage=en_US");
        conn.setRequestProperty("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-check-cacheable, akamai-x-get-cache-key, akamai-x-get-extracted-values, akamai-x-get-nonces, akamai-x-get-ssl-client-session-id, akamai-x-get-true-cache-key, akamai-x-serial-no");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Cache-Control", "max-age=0");
        Map<String, List<String>> map = conn.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " ,Value : " + entry.getValue());
        }
        Assert.assertEquals("YES", conn.getHeaderField("X-Check-Cacheable"));
        Assert.assertEquals("/L/8125/250672/15m/www.ivivva.com/products/clothes-accessories/girls-hoodies/perfect-your-practice-jacket cid=cc=24272&skuId=us_3660234&catId=girls-hoodies_UsrLocale=en_US&Country=US&cartCount=0_", conn.getHeaderField("X-Cache-Key"));
    }


}
