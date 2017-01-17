package TestData.IV.HomePage;


import org.testng.Assert;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


public class HomePageHeaders {

    public void HomePageResponseForCanada() throws Exception {

        //PrintStream myconsole = new PrintStream("C:\\Users\\sigure\\Desktop\\Ruby+Java+RestAPI Automation Files\\RamanFiles\\HybridNew\\src\\Log\\ResponseHeaderGuestUserWithUserLocaleprese.txt");
        //System.setOut(myconsole);
        URL obj = new URL("http://www.ivivva.com");
        URLConnection conn = obj.openConnection();
        conn.setRequestProperty("Host", "www.ivivva.com");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        conn.setRequestProperty("Cookie", "JSESSIONID=13AF049406FC56511F1976C08C1B3710; UsrLocale=en_CA; Country=CA; ca_ord=MG0YsNirdd8gtznBAoD8Zw==; isLoggedin=false; cartCount=0; NSC_mvmvmfnpo_jwjwwb_qspew10_mc=ffffffff09c943d845525d5f4f58455e445a4a4229a0; ak_bmsc=CBDAF0C18B88A1A7222239281B3B2914D108706624360000B0087058DE45455B~plZQvMmQ6SqxMNnXBnZQQR/nah6FBgsrTqFkyzMRn9OVibxRxhH1wlf9hDy9/Wc6QT81i8N+GcOLns8DqcorSlQdzx9/tJeWJltHDKd/2Uhy92ErGI0Fe2vvZLriv/bJkwB0+GUklAKF64TUez7JX5INRpR9LIz3I6bAwuOls45WWU8cBV6kB9MLBEGGwRTQAD2ZnB3dduZhIBthUBw6sqoy+ypfXx/uSis8J7FGXpkxk=; akavpau_vp_ivivva_www=1483737566~id=87743e9b70d4024ea731234875e843c5; omniID=1483737265332Xstf; mbox=check#true#1483737326|session#1483737265350-753120#1483739126; s_cc=true; s_fid=40316476EF553628-27E69281D11325E0; c_m2=1; c_m=undefinedDirect%20LoadDirect%20Load; s_nr=1483737265711; s_vnum=1486329265712%26vn%3D1; s_invisit=true; s_lv=1483737265713; s_lv_s=First%20Visit; s_sq=%5B%5BB%5D%5D; BTT_X0siD=274970826738781819; BTT_Collect=on; sandy-session-id=795f3c69279311d8; sandy-client-id=6d4ea4b0ef1e48ff; sl=CA; s_vi=[CS]v1|2C380458851D53C8-4000190EA007F9A1[CE]; __utma=210616138.1312840166.1483737268.1483737268.1483737268.1; __utmb=210616138.1.10.1483737268; __utmc=210616138; __utmz=210616138.1483737268.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt_ga=1; _ga=GA1.2.1312840166.1483737268; _gat_mobifyTracker=1; BTT_WCD_Collect=off");
        conn.setRequestProperty("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-check-cacheable, akamai-x-get-cache-key, akamai-x-get-extracted-values, akamai-x-get-nonces, akamai-x-get-ssl-client-session-id, akamai-x-get-true-cache-key, akamai-x-serial-no");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Cache-Control", "max-age=0");
        Map<String, List<String>> map = conn.getHeaderFields();
        System.out.println("Printing Response Header...\n");
        System.out.println("This test is for Guest user with userlocale present\n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " ,Value : " + entry.getValue());
        }
        Assert.assertEquals("YES", conn.getHeaderField("X-Check-Cacheable"));
        Assert.assertEquals("/L/8125/250672/1d/www.ivivva.com/ cid=_UsrLocale=en_CA&Country=CA&cartCount=0_", conn.getHeaderField("X-Cache-Key"));


    }

    public void HomePageResponseForUSA() throws Exception {
        URL obj = new URL("http://www.ivivva.com");
        URLConnection conn = obj.openConnection();
        conn.setRequestProperty("Host", "www.ivivva.com");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        conn.setRequestProperty("Cookie", "JSESSIONID=B4514C2BFD5DE0AA333949E33E7A9B08; UsrLocale=en_US; Country=US; ca_ord=MG0YsNirdd8ukeIuVYm65w==; isLoggedin=false; cartCount=0; NSC_mvmvmfnpo_jwjwwb_qspew10_mc=ffffffff09c943d645525d5f4f58455e445a4a42168c; ak_bmsc=4DF93C3A27DCC02E30D4355E64DFBC4ED10870639F6500003B26705829E15F4E~plps0DSg/L2jre9WB5cwQZUjOH9PsO5nwjXYQuie8TbJo+jdP7YAOSvO43VLQ3hEb1YYqXBLugNW4sUMQsL8KPlTEXG7Dy2e/9qLWfrWkylBcdOMYWaL4jsAGSBvXE/xbXtqhfLZZssaIn6rHYm2tAVKrtcR0wkrcRCLPShszpUYWbEqrZrbXKBosL4v7wHxtDAdsExP6r9CV4/rKm3g5Ksg==; akavpau_vp_ivivva_www=1483745208~id=e2c3b1918023a1806a47b6a562dddb1e; sandy-session-id=0b0d9af34b05b879; sandy-client-id=2e8ffecf5bb8b685; omniID=1483744828051q00F; mbox=check#true#1483744970|session#1483744828062-23063#1483746770; s_cc=true; s_fid=3EC725B41CABA2BD-2F679ACD5D260588; c_m2=1; c_m=undefinedDirect%20LoadDirect%20Load; s_nr=1483744910261; s_vnum=1486336828338%26vn%3D1; s_invisit=true; s_lv=1483744910263; s_lv_s=First%20Visit; s_sq=%5B%5BB%5D%5D; BTT_X0siD=891227306907924116; BTT_Collect=on; _ga=GA1.2.345935537.1483744829; _gat_mobifyTracker=1; __utma=210616138.345935537.1483744829.1483744829.1483744829.1; __utmb=210616138.31.8.1483744903379; __utmc=210616138; __utmz=210616138.1483744829.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt_ga=1; s_vi=[CS]v1|2C38131E051D10E6-4000190720072F2D[CE]; sl=US; BTT_WCD_Collect=off; regionMsgShown=true; emailSignupCDPCookie=true; NSC_JOor3tnbcwc1l2hdtpjjr5dyiriurdc=ffffffff09c943d645525d5f4f58455e445a4a423660; userPrefLanguage=en_US; us_ord=TZfkrLKfgrvp1a6wvxj9Jw==");
        conn.setRequestProperty("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-check-cacheable, akamai-x-get-cache-key, akamai-x-get-extracted-values, akamai-x-get-nonces, akamai-x-get-ssl-client-session-id, akamai-x-get-true-cache-key, akamai-x-serial-no");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Cache-Control", "max-age=0");

        Map<String, List<String>> map = conn.getHeaderFields();

        System.out.println("Printing Response Header...\n");

        System.out.println("This test is for Guest user with userlocale present\n");

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " ,Value : " + entry.getValue());
        }

        Assert.assertEquals("YES", conn.getHeaderField("X-Check-Cacheable"));
        Assert.assertEquals("/L/8125/250672/1d/www.ivivva.com/ cid=_UsrLocale=en_US&Country=US&cartCount=0_", conn.getHeaderField("X-Cache-Key"));



    }

}
